package chapter.g.thread.task2;

public class MyRunnable implements Runnable {
    String name;
    private boolean isJobDone;

    public MyRunnable(String name) {
        this.name = name;
    }

    public boolean isJobDone() {
        return isJobDone;
    }

    @Override
    public void run() {
        System.out.printf("Wątek podrzędny %s wystartował%n", name);
        try {

            for (int i = 0; i <= 10; i++) {
                System.out.printf("Progress: %d%% %n", i * 10);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.printf("Interrupted %s%n", name);
            Thread.currentThread().interrupt();
        }

        System.out.println("Skończyłem!");
        isJobDone = true;
    }
}
