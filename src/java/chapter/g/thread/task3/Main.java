package chapter.g.thread.task3;

public class Main {
    /**
     * Program, który tworzy 3 wątki potomne.
     */
    public static void main(String[] args) {
        System.out.println("Start main thread!");
        MyRunnable runnable1 = new MyRunnable("Thread 1");
        MyRunnable runnable2 = new MyRunnable("Thread 2");
        MyRunnable runnable3 = new MyRunnable("Thread 3");

        while (runnable1.isAlive() || runnable2.isAlive() || runnable3.isAlive()) {
            try {
                System.out.println("Czekam na koniec wątków podrzędnych");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Wątek główny interupted");
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Koniec pracy wątku głównego");
    }
}
