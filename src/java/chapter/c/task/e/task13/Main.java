package chapter.c.task.e.task13;

public class Main {
    /**
     * Program, który za pomocą instrukcji for sumuje liczby nieparzyste od 1 do 100.
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
        for (int i = begin; i <= end; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }

        return sum;
    }
}
