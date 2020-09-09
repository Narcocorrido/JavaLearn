package chapter1.task6;

public class Main {
    /**
     * Program, który oblicza resztę z dzielenia całkowiteog dwóch liczb całkowitych a = 37 i b = 11.
     */
    public static void main(String[] args) {
        int a = 37;
        int b = 11;
        int modulo = a % b;

        System.out.printf("Program oblicza resztę z dzioelenia całkowitego %n" +
                "dla dwóch liczb całkowitych. %n" +
                "Dla liczb: a = %d, b = %d %n", a, b);
        System.out.printf("%d%%%d = %d", a, b, modulo);
    }
}
