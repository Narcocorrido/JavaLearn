package chapter.c.task4;

public class Main {
    /**
     * Program, który za pomocą instrukcji for wyświetla liczby całkowite od 1 do 20.
     */
    public static void main(String[] args) {
        String message = "Program wyświetla liczby całkowite od 1 do 20.";
        System.out.println(message);
        printNumbers(1, 20);
    }

    private static void printNumbers(int begin, int end) {
        StringBuilder numbers = new StringBuilder();
        for (int i = begin; i <= end; i++) {
            numbers.append(i);
            if (i == 20) {
                numbers.append('.');
            } else {
                numbers.append(',');
            }
        }

        System.out.println(numbers);
    }
}
