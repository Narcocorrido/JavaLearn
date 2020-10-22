package chapter.c.task.h.for_;

public class Main {
    /**
     * Program, który wyświetla duże litery alfabetu od A do Z i od Z do A z wykorzystaniem pętli for.
     */
    public static void main(String[] args) {
        System.out.println("Program wyświetla duże litery alfabetu od A do Z i od Z do A.");
        printAlphabet();
    }

    private static void printAlphabet() {
        int a = 'A';
        int z = 'Z';
        for (int i = a; i <= z; i++) {
            if (i < z) {
                System.out.print((char) i + ",");
            } else {
                System.out.print((char) i + ".");
            }
        }

        System.out.println();

        for (int i = z; i >= a; i--) {
            if (i > a) {
                System.out.print((char) i + ",");
            } else {
                System.out.print((char) i + ".");
            }
        }
    }
}
