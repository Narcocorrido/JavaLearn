package chapter.c.task.g.for_;

public class Main {
    /**
     * Program wyświetlający tabliczkę mnożenia dla liczb od 1 do 100 z wykorzystaniem podwójnej pętli for.
     */
    public static void main(String[] args) {
        System.out.println("Program wyświetla tabliczkę mnożenia dla liczb od 1 do 100.");
        printMultiplicationTable();
    }

    private static void printMultiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d\t", i * j);
            }
            System.out.print('\n');
        }
    }
}
