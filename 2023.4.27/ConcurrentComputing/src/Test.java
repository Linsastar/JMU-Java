import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author gong
 */
public class Test {
    public static void main(String[] args) throws Exception {
        // 线程数量
        int nThreads = 1000;
        // 待计算的整数起始值
        int m = 1;
        // 待计算的整数终止值
        long n = 1000000000;
        // 每个线程计算的整数数量
        long batchSize = (n - m + 1) / nThreads;

        List<SumWorker> workers = new ArrayList<>();
        long sum = 0;

        while (m <= n) {
            Thread[] threads = new Thread[nThreads];

            for (int i = 0; i < nThreads && m <= n; i++) {
                int start = m;
                long end = (i == nThreads - 1) ? n : (m + batchSize - 1);
                SumWorker worker = new SumWorker(start, end);
                workers.add(worker);
                threads[i] = new Thread(worker);
                threads[i].start();
                m += batchSize;
            }
            for (Thread thread : threads) {
                if (thread != null) {
                    thread.join();
                }
            }
            for (SumWorker worker : workers) {
                sum += worker.getResult();
            }
            workers.clear();
        }

        System.out.println("sum = " + sum);
    }
}


