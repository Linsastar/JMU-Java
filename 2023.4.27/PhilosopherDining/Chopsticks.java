/**
 * @author gong
 */
class Chopsticks {
    private boolean isUsed;

    public synchronized void pickUp() {
        while (isUsed) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isUsed = true;
    }

    public synchronized void putDown() {
        isUsed = false;
        notifyAll();
    }
}

