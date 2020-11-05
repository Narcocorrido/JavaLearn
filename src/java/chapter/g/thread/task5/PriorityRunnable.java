package chapter.g.thread.task5;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class PriorityRunnable implements Runnable {

    private static final int MILLISECONDS = 1_000_000;
    private static final int RANGE = 50_000;

    private final Thread thread;
    private long timeSpend = 0;
    private List<Integer> primeNumbers = new ArrayList<>();

    public PriorityRunnable(String name, int priority) {
        thread = new Thread(this, name);
        thread.setPriority(priority);
        thread.start();
    }

    public long getTimeSpend() {
        return this.timeSpend / MILLISECONDS;
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " startuje.");
        findPrimeNumbers();
        System.out.println(thread.getName() + " zakończono.");
    }

    public void join() throws InterruptedException {
        this.thread.join();
    }

    private void findPrimeNumbers() {
        for (int i = 1; i <= RANGE; i++) {
            Instant previous = Instant.now();
            int dividersCount = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    dividersCount++;
                }
            }
            if (dividersCount == 2) {
                primeNumbers.add(i);
            }

            Instant current = Instant.now();
            int nano = Duration.between(previous, current).getNano();
            timeSpend = timeSpend + nano;
        }
    }
}
