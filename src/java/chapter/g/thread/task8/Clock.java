package chapter.g.thread.task8;

public class Clock {
    public synchronized void tik(boolean run) throws InterruptedException {
        if (!run){
            notify();
            return;
        }

        System.out.print("Tik! ");
        notify();
        wait();
    }

    public synchronized void tak(boolean run) throws InterruptedException {
        if (!run){
            notify();
            return;
        }
        System.out.print("Tak!");
        System.out.println();

        notify();
        wait();
    }
}
