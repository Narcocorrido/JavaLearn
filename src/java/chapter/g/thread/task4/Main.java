package chapter.g.thread.task4;

public class Main {
    /**
     * Program, który korzysta z poprzedniego zadania {@link chapter.g.thread.task3.Main} i metody join(), aby upewnić się,
     * że główny wątek jest ostatnim wątkiem, który się zakończy.
     */
    public static void main(String[] args) {
        System.out.println("Początek wątku głównego");

        MyRunnable myRunnable1 = new MyRunnable("Thread 1");
        MyRunnable myRunnable2 = new MyRunnable("Thread 2");
        MyRunnable myRunnable3 = new MyRunnable("Thread 3");

        try {
            myRunnable1.join();
            myRunnable2.join();
            myRunnable3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Koniec wątku głównego");
    }
}
