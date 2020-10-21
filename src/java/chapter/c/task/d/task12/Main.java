package chapter.c.task.d.task12;

public class Main {
    /**
     * Program, który za pomocą instrukcji do ... while sumuje liczby parzyste od 1 do 100.
     */
    public static void main(String[] args) {
        int begin = 1;
        int end = 100;
        String message = String.format("Program sumuje liczby parzyste od %d do %d.", begin, end);
        System.out.println(message);

        int sum = sumNumbers(begin, end);
        System.out.printf("Suma liczb parzystych od %d do %d wynosi %d.", begin, end, sum);
    }

    public static int sumNumbers(int begin, int end) {
        int sum = 0;
        int i = begin;
        while (i <= end) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }

        return sum;
    }
}
