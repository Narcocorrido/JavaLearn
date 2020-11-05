package chapter.g.thread.task1;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Wątek podrzędny");
    }
}
