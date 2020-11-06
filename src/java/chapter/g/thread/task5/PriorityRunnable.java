package chapter.g.thread.task5;

public class PriorityRunnable implements Runnable {
    private final Thread thread;
    private volatile boolean stop = false;
    private long counter = 0;

    public PriorityRunnable(String name, int priority) {
        thread = new Thread(this, name);
        thread.setPriority(priority);
        thread.start();
    }

    public long getCounter() {
        return counter;
    }

    public void setStop() {
        this.stop = true;
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " startuje.");
        while (!stop) {
            counter++;
        }
        System.out.println(thread.getName() + " zakończono.");
    }

    public void join() throws InterruptedException {
        this.thread.join();
    }
}
