package chapter.g.thread.task6;

public class SumArray {

    public synchronized long sumArray(int[] input) throws InterruptedException {
        int[] numbers = input;
        long sum = 0;
        for (int number : numbers) {
            sum += number;
            System.out.printf("Biezaca wartość sumy dla %s wynosi %d%n", Thread.currentThread().getName(), sum);

            synchronized (numbers) {
                do {
                    numbers.wait(100);
                } while (sum > 100);
            }
        }

        return sum;
    }
}
