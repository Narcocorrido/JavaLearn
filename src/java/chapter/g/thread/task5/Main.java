package chapter.g.thread.task5;

public class Main {
    /**
     * Program, który demonstruje działanie dwóch wątków o różnych priorytetach.
     */
    public static void main(String[] args) throws InterruptedException {
        PriorityRunnable lowPriority = new PriorityRunnable("Niski priorytet", Thread.NORM_PRIORITY + 1);
        PriorityRunnable highPriority = new PriorityRunnable("Wysoki priorytet", Thread.NORM_PRIORITY + 4);

        Thread.sleep(300);

        highPriority.setStop();
        lowPriority.setStop();

        highPriority.join();
        lowPriority.join();

        System.out.printf("Wysoki priorytet doliczył do %d %n", highPriority.getCounter());
        System.out.printf("Niski priorytet doliczył do %d %n", lowPriority.getCounter());
    }
}
