package chapter.g.thread.task2;

public class Main {
    /**
     * Program, który tworzy nowy wątek poprzez implementację intrfejsu Runnable.
     */
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable("Wątek 1");
        Thread thread = new Thread(runnable);
        thread.start();

        while (!runnable.isJobDone()) {
            try {
                Thread.sleep(400);
                System.out.println("Czekam na koniec wątku podrzędnego");
            } catch (InterruptedException e) {
                System.out.println("Wątek główny interupted");
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Koniec pracy wątku głównego");
    }
}
