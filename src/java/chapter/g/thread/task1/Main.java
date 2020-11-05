package chapter.g.thread.task1;

public class Main {
    /**
     * Program, który tworzy jeden wątek i go uruchamia. Tworzenie wątku odbywa się poprzez poszerzenie klasy Thread.
     */
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("Wątek główny");
    }
}
