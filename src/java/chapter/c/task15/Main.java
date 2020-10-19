package chapter.c.task15;

public class Main {
    /**
     * Program, który za pomocą instrukcji while sumuje liczby nieparzyste od 1 do 100.
     */
    public static void main(String[] args) {
        int begin = 1;
        int end = 100;
        String message = String.format("Program sumuje liczby nieparzyste od %d do %d.", begin, end);
        System.out.println(message);

        int sum = sumNumbers(begin, end);
        System.out.printf("Suma liczb nieparzystych od %d do %d wynosi %d.", begin, end, sum);
    }

    public static int sumNumbers(int begin, int end) {
        int sum = 0;
        int i = begin;
        while (i <= end) {
            if (i % 2 == 1) {
                sum += i;
            }
            i++;
        }

        return sum;
    }
}
