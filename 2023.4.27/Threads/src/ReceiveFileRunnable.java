/**
 * @author gong
 */
public class ReceiveFileRunnable implements Runnable {
    private String filename;
    private Thread thread;

    public ReceiveFileRunnable(String filename) {
        this.filename = filename;
        this.thread = new Thread(this);
    }

    @Override
    public void run() {
        System.out.println("I am receiving file: " + filename);
        try {
            Thread.sleep((long) (3000 + Math.random() * 3000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("File: " + filename + " has been received.");
    }
    public void start() {
        thread.start();
    }

    public void join() throws InterruptedException {
        thread.join();
    }
}