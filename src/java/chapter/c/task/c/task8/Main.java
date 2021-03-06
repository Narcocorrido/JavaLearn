package chapter.c.task.c.task8;

public class Main {
    /**
     * Program, który przy użyciu instrukcji do ... while sumuje liczby całkowite od 1 do 100.
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
        int i = begin;
        int sum = 0;
        do {
            sum += i;
            i++;
        } while (i <= end);

        return sum;
    }
}
