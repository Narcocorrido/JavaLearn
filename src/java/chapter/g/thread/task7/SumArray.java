package chapter.g.thread.task7;

public class SumArray {

    public long sumArray(int[] input) throws InterruptedException {
        int[] numbers = input;
        long sum = 0;
        for (int number : numbers) {
            sum += number;
            System.out.printf("Biezaca wartość sumy dla %s wynosi %d%n", Thread.currentThread().getName(), sum);

            Thread.sleep(100);
        }

        return sum;
    }
}
