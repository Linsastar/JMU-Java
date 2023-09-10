/**
 * @author gong
 */
public class Test {
    public static int count = 0;
    public static void main(String[] args) {
        Chopsticks c1 = new Chopsticks();
        Chopsticks c2 = new Chopsticks();
        Chopsticks c3 = new Chopsticks();
        Chopsticks c4 = new Chopsticks();
        Chopsticks c5 = new Chopsticks();
        Philosopher p1 = new Philosopher("巩晨阳", c1, c2);
        Philosopher p2 = new Philosopher("范乔智", c2, c3);
        Philosopher p3 = new Philosopher("邹佳琳", c3, c4);
        Philosopher p4 = new Philosopher("王厚润", c4, c5);
        Philosopher p5 = new Philosopher("黄少杰", c5, c1);
        Thread thread01 = new Thread(p1);
        thread01.start();
        Thread thread02 = new Thread(p2);
        thread02.start();
        Thread thread03 = new Thread(p3);
        thread03.start();
        Thread thread04 = new Thread(p4);
        thread04.start();
        Thread thread05 = new Thread(p5);
        thread05.start();
    }
}
