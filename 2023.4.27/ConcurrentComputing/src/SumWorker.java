class SumWorker implements Runnable {
    private long m;
    private long n;
    private long sum;

    public SumWorker(long m, long n) {
        this.m = m;
        this.n = n;
        this.sum = 0;
    }

    public void run() {
        for (long i = m; i <= n; i++) {
            sum += i;
        }
    }

    public long getResult() {
        return sum;
    }
}