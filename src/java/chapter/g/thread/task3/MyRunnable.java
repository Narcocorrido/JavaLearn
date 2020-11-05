package chapter.g.thread.task3;

public class MyRunnable implements Runnable {
    private Thread thread;

    public MyRunnable(String name) {
        thread = new Thread(this, name);
        thread.start();
    }

    public boolean isAlive() {
        return thread.isAlive();
    }

    @Override
    public void run() {
        System.out.printf("Wątek podrzędny %s wystartował%n", thread.getName());
        try {

            for (int i = 0; i <= 10; i++) {
                System.out.printf("%s progress: %d%% %n", thread.getName(), i * 10);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.printf("Interrupted %s%n", thread.getName());
            Thread.currentThread().interrupt();
        }

        System.out.printf("%s Skończyłem!%n", thread.getName());
    }
}
