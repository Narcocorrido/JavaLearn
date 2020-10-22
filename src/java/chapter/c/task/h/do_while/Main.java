package chapter.c.task.h.do_while;

public class Main {
    /**
     * Program, który wyświetla duże litery alfabetu od A do Z i od Z do A z wykorzystaniem pętli do ... while.
     */
    public static void main(String[] args) {
        System.out.println("Program wyświetla duże litery alfabetu od A do Z i od Z do A.");
        printAlphabet();
    }

    private static void printAlphabet() {
        int a = 'A';
        int z = 'Z';

        int i = a;
        do {
            if (i < z) {
                System.out.print((char) i + ",");
            } else {
                System.out.print((char) i + ".");
            }
            i++;
        } while (i <= z);

        System.out.println();
        int j = z;
        do {
            if (j > a) {
                System.out.print((char) j + ",");
            } else {
                System.out.print((char) j + ".");
            }
            j--;
        } while (j >= a);
    }
}
