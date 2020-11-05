package chapter.g.thread.task7;

public class MyThread implements Runnable {

    private final Thread thread;
    private final int[] ints;
    private SumArray sumArray;
    private long sum;

    public MyThread(String name, int[] ints, SumArray sumArray) {
        thread = new Thread(this, name);
        thread.start();
        this.ints = ints;
        this.sumArray = sumArray;
    }

    public long getSum() {
        return sum;
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " startuje.");

        try {
            synchronized (sumArray) {
                this.sum = sumArray.sumArray(ints);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }

        System.out.printf("Suma koncowa dla wątku %s wynosi %d %n", thread.getName(), getSum());
        System.out.println(thread.getName() + " zakończono.");
    }
}
