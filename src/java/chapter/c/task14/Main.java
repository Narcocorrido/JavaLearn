package chapter.c.task14;

public class Main {
    /**
     * Program, który za pomocą instrukcji do ... while sumuje liczby nieparzyste od 1 do 100.
     */
    public static void main(String[] args) {
        int begin = 1;
        int end = 100;
        String message = String.format("Program sumuje liczby nieparzyste od %d do %d.", begin, end);
        System.out.println(message);

        int sum = sumNumbers(begin, end);
        System.out.printf("Suma liczb nieparzystych od %d do %d wynosi %d.", begin, end, sum);
    }

    private static int sumNumbers(int begin, int end) {
        int sum = 0;
        int i = begin;
        do {
            if (!(i % 2 == 0)) {
                sum += i;
            }
            i++;
        } while (i <= end);

        return sum;
    }
}
