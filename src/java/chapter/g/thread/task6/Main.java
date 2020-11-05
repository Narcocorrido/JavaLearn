package chapter.g.thread.task6;

public class Main {
    /**
     * Program, który ilustruje dostęp do metod poprzez zmodyfikowanie ich za pomocą słowa kluczowego synchronized.
     * Program zawiera trzy klasy. Pierwsza z nich, SumArray, zawiera metodę sumArray() sumującą elementy zamieszczone
     * w tablicy. Druga klasa, MyThread, używa obiektu typu sumArray do uzyskania sumy elementów tablicy składających
     * się z liczb całkowitych. Ostatnia klasa, Main, tworzy dwa wątki, które obliczają sumę elementów zawartch w
     * tablicy.
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        SumArray sumArray = new SumArray();

        new MyThread("Thread 1", numbers, sumArray);
        new MyThread("Thread 2", numbers, sumArray);
    }
}
