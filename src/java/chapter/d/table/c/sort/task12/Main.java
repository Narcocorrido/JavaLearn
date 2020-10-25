package chapter.d.table.c.sort.task12;

public class Main {
    /**
     * Posortuj rosnąco następujące 6 liczb: 574, 303, 34, 125, 8 oraz 23, stosując algorytm sortowania bąbelkowego.
     */
    public static void main(String[] args) {
        int[] input = {574, 303, 34, 125, 8, 23};

        int[] my = bubbleSortMy(input);
        int[] book = bubbleSortBook(input);

        System.out.println("Dla liczb:");
        printTable(input);
        System.out.println();
        System.out.println("liczby uporządkowane to:");
        System.out.println("My sort output");
        printTable(my);
        System.out.println();
        System.out.println("Book sort output");
        printTable(book);
    }

    private static void printTable(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + "\t");
        }
    }

    private static int[] bubbleSortMy(int[] input) {
        int sum = 0;
        int[] output = input.clone();
        for (int i = 0; i < output.length; i++) {
            int currentBubble = output[i];
            for (int j = i; j > 0; j--) {
                int aboveBubble = output[j - 1];
                if (currentBubble < aboveBubble) {
                    output[j - 1] = currentBubble;
                    output[j] = aboveBubble;
                    sum++;
                }
            }
        }

        System.out.printf("Swap in my version: %d \n", sum);
        return output;
    }

    private static int[] bubbleSortBook(int[] input) {
        int[] output = input.clone();
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                if (output[j - 1] > output[j]) {
                    int x = output[j - 1];
                    output[j - 1] = output[j];
                    output[j] = x;
                    sum++;
                }
            }
        }

        System.out.printf("Swap in book version: %d \n", sum);
        return output;
    }
}
