package chapter.g.thread.task9;

public class MyThread implements Runnable {
    private final Thread thread;
    private volatile boolean pause = false;
    private volatile boolean stop = false;

    public MyThread() {
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            printNumber(i);
            if (pause) {
                synchronized (this) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        Thread.currentThread().interrupt();
                    }
                }
            }

            if (stop) {
                break;
            }

        }
    }

    public synchronized void pause() {
        this.pause = true;
    }

    public synchronized void wake() {
        this.pause = false;
        notifyAll();
    }

    public synchronized void stop() {
        this.stop = true;
        this.pause = false;
        notifyAll();
    }

    public void join() throws InterruptedException {
        thread.join();
    }

    private void printNumber(int number) {
        System.out.printf("%d \t", number);
        if (number % 10 == 0) {
            System.out.println();
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }
}
