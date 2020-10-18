package chapter.c.task5;

public class Main {
    /**
     * Program, który za pomocą instrukcji do ... while wyświetla liczby całkowite od 1 do 20.
     */
    public static void main(String[] args) {
        String message = "Program wyświetla liczby całkowite od 1 do 20.";
        System.out.println(message);
        printNumbers(1, 20);
    }

    private static void printNumbers(int begin, int end) {
        StringBuilder numbers = new StringBuilder();
        int i = begin;
        do {
            numbers.append(i);
            if (i == 20) {
                numbers.append('.');
            } else {
                numbers.append(',');
            }
            i++;
        } while (i <= end);

        System.out.println(numbers);
    }
}
