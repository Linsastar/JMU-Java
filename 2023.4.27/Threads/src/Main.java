/**
 * @author gong
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ReceiveFileRunnable[] receiveThreads = new ReceiveFileRunnable[5];
        SendFileRunnable[] sendThreads = new SendFileRunnable[5];

        for (int i = 0; i < 5; i++) {
            receiveThreads[i] = new ReceiveFileRunnable("file" + i + ".txt");
            sendThreads[i] = new SendFileRunnable("file" + i + ".txt");

            receiveThreads[i].start();
            sendThreads[i].start();
        }

        for (ReceiveFileRunnable receiveThread : receiveThreads) {
            receiveThread.join();
        }
        for (SendFileRunnable sendThread : sendThreads) {
            sendThread.join();
        }

        System.out.println("QQ文件收发任务结束");
    }
}