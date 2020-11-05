package chapter.g.thread.task9;

public class Main {
    /**
     * Program, który korzystając z własnych metod, zarządza wątkami, tzn. zawiesza, wznawia oraz je zatrzymuje.
     */
    public static void main(String[] args) throws InterruptedException {

        MyThread myThread = new MyThread();
        Thread.sleep(1000);

        pauseThread(myThread);
        Thread.sleep(1000);

        pauseThread(myThread);
        Thread.sleep(1000);

        pauseThread(myThread);
        Thread.sleep(1000);

        System.out.println("Przerywam wątek!");
        myThread.stop();

        myThread.join();
        System.out.println("Koniec głównego wątku");
    }

    private static void pauseThread(MyThread myThread) throws InterruptedException {
        myThread.pause();
        System.out.println("Wstrzymany wątek!");
        Thread.sleep(1000);
        System.out.println("Wybudzam wątek!");
        myThread.wake();
    }
}
