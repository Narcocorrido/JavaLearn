package chapter.g.thread.task8;

public class MyThread implements Runnable {

    private Thread thread;
    private Clock clock;

    public MyThread(String name, Clock clock) {
        this.thread = new Thread(this, name);
        this.clock = clock;
        thread.start();
    }

    @Override
    public void run() {
        try {

            switch (thread.getName()) {
                case "Tik":
                    for (int i = 0; i < 10; i++) {
                        clock.tik(true);
                    }
                    clock.tik(false);
                    break;
                case "Tak":
                    for (int i = 0; i < 10; i++) {
                        clock.tak(true);
                    }
                    clock.tak(false);
                    break;
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }
}
