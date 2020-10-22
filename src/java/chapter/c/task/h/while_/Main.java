package chapter.c.task.h.while_;

public class Main {
    /**
     * Program, który wyświetla duże litery alfabetu od A do Z i od Z do A z wykorzystaniem pętli while.
     */
    public static void main(String[] args) {
        System.out.println("Program wyświetla duże litery alfabetu od A do Z i od Z do A.");
        printAlphabet();
    }

    private static void printAlphabet() {
        int a = 'A';
        int z = 'Z';

        int i = a;
        while (i <= z) {
            if (i < z) {
                System.out.print((char) i + ",");
            } else {
                System.out.print((char) i + ".");
            }
            i++;
        }

        System.out.println();
        int j = z;
        while (j >= a) {
            if (j > a) {
                System.out.print((char) j + ",");
            } else {
                System.out.print((char) j + ".");
            }
            j--;
        }
    }
}
