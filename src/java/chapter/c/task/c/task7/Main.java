package chapter.c.task.c.task7;

public class Main {
    /**
     * Program, który przy użyciu instrukcji for sumuje liczby całkowite od 1 do 100.
     */
    public static void main(String[] args) {
        String message = "Program sumuje liczby całkowite od 1 do 100.";
        System.out.println(message);
        int begin = 1;
        int end = 100;
        int sum = sumNumbers(begin, end);
        System.out.printf("Suma liczb całkowitych od %d do %d wynosi %d.", begin, end, sum);
    }

    private static int sumNumbers(int begin, int end) {
        int sum = 0;
        for (int i = begin; i <= end; i++) {
            sum += i;
        }

        return sum;
    }
}
