package chapter.c.task6;

public class Main {
    /**
     * Program, który za pomocą instrukcji while wyświetla liczby całkowite od 1 do 20.
     */
    public static void main(String[] args) {
        String message = "Program wyświetla liczby całkowite od 1 do 20.";
        System.out.println(message);
        printNumbers(1, 20);
    }

    private static void printNumbers(int begin, int end) {
        StringBuilder numbers = new StringBuilder();
        int i = begin;
        while (i <= end) {
            numbers.append(i);
            if (i == 20) {
                numbers.append('.');
            } else {
                numbers.append(',');
            }
            i++;
        }

        System.out.println(numbers);
    }
}
