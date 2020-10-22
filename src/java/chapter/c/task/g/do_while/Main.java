package chapter.c.task.g.do_while;

public class Main {
    /**
     * Program wyświetlający tabliczkę mnożenia dla liczb od 1 do 100 z wykorzystaniem podwójnej pętli do ... while.
     */
    public static void main(String[] args) {
        System.out.println("Program wyświetla tabliczkę mnożenia dla liczb od 1 do 100.");
        printMultiplicationTable();
    }

    private static void printMultiplicationTable() {
        int i = 1;
        do {
            int j = 1;
            do {
                System.out.print(i * j + "\t");
                j++;
            } while (j <= 10);
            System.out.println();
            i++;
        } while (i <= 10);
    }
}
