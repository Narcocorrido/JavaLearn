package chapter.g.thread.task7;

public class Main {
    /**
     * Program, który synchronizuje metodę sumArray() w inny sposób niż w poprzednim zadaniu.
     * Metoda ta powinna zostać wywołana polecenim synchronized wewnątrz bloku.
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        SumArray sumArray = new SumArray();

        new MyThread("Thread 1", numbers, sumArray);
        new MyThread("Thread 2", numbers, sumArray);
    }
}
