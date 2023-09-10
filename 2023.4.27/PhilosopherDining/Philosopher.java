class Philosopher implements Runnable {
    private String name;
    private Chopsticks leftChopstick;
    private Chopsticks rightChopstick;

    public Philosopher(String name, Chopsticks leftChopstick, Chopsticks rightChopstick) {
        this.name = name;
        this.leftChopstick = leftChopstick;
        this.rightChopstick = rightChopstick;
    }

    public void run() {
        while (true) {
            think();
            eat();
            System.out.println(name + "吃完了");
            leftChopstick.putDown();
            rightChopstick.putDown();
        }
    }

    private void think() {
        try {
            System.out.println(name + "开始思考");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void eat() {
        try {
            leftChopstick.pickUp();
            synchronized (leftChopstick) {
                rightChopstick.pickUp();
                synchronized (rightChopstick) {
                    System.out.println(name + "开始吃饭");
                    Thread.sleep(2000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
先来看一下Philosopher类，这个类实现了Runnable接口，每个哲学家都是一个线程，有一个名字、左右两只筷子。然后定义了run()、think()、eat()三个方法。
        run()方法里面是一个死循环，不停地思考、吃饭、放下筷子，相当于模拟了一个哲学家的生活。在每次思考和吃饭之前，调用了think()和eat()方法。
        think()方法表示哲学家开始思考，执行时间为2秒钟。
        eat()方法表示哲学家开始吃饭，先拿起左边的筷子，如果左边没有筷子可用，则等待。然后再尝试取右边的筷子，如果右边没有可用的，则必须先将左边的放回去，等待其他哲学家将筷子放下。最后，如果成功获取了右边的筷子，则开始吃饭，执行时间为2秒钟。
        再来看一下Chopsticks类，这个类表示一只筷子，有一个状态变量isUsed（是否被使用），同时定义了pickUp()和putDown()两个方法。
        pickUp()方法表示将筷子拿起来，如果当前这只筷子已经被使用，则等待（调用wait()方法），直到其他线程通过调用putDown()方法将其放下。
        putDown()方法表示将筷子放下，并且将isUsed变回false，并且通知其他等待的线程。
        最后是Test类，主要函数是main()，首先定义了五个筷子和五个哲学家，每个哲学家拿到的左右筷子不同，然后开启五个线程，每个线程对应一个哲学家。
        执行步骤如下：
        创建五个哲学家和五个筷子对象。
        创建五个线程分别对应五个哲学家。
        启动五个线程，每个线程都会进入Philosopher的run()函数里面，开始思考和吃饭。
        在eat()方法中，如果当前线程无法获得左边或右边的筷子，则会一直等待，直到其他线程释放筷子且自己成功获取到筷子。如果一个哲学家持有左边的筷子但无法获取右边的筷子，则会一直占用左边的筷子并且无法释放，导致其他哲学家也无法获取这只筷子，从而引起死锁。
        如果一个哲学家成功获取到左右两只筷子，则开始进食，执行时间为2秒钟。
        在吃完饭之后，哲学家会将筷子放下，并通知其他线程有筷子可用。然后再次进行思考和吃饭的循环。*/
