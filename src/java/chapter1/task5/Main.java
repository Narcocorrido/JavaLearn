package chapter1.task5;

public class Main {
    /**
     * Program, który oblicza wynik dzielenia całkowitego bez reszty dwóch liczb całkowitych: a = 37 i b = 11.
     */
    public static void main(String[] args) {
        int a = 37;
        int b = 11;
        System.out.printf("Program wyświtla wynik dzilenia całkowitego %n" +
                "bez reszty dla dwóch liczb całkowitych. %n" +
                "Dla liczb: a = %d, b = %d %n", a, b);
        int result = a / b;
        System.out.printf("%d/%d = %d.", a, b, result);
    }
}
