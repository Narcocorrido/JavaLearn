package chapter.c.task.g.while_;

public class Main {
    /**
     * Program wyświetlający tabliczkę mnożenia dla liczb od 1 do 100 z wykorzystaniem podwójnej pętli while.
     */
    public static void main(String[] args) {
        System.out.println("Program wyświetla tabliczkę mnożenia dla liczb od 1 do 100.");
        printMultiplicationTable();
    }

    private static void printMultiplicationTable() {
        int i = 1;
        while (i <= 10) {
            int j = 1;
            while (j <= 10) {
                System.out.print(i * j + "\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
