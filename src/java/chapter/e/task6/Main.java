package chapter.e.task6;

import java.util.Scanner;

public class Main {
    /**
     * Program, który rekurencyjnie znajduje 10 pierwszych liczb trójkątnuch i wyświetla je na ekranie komputera.
     */
    public static void main(String[] args) {
        System.out.println("Obliczanie liczb trójkątnych dla dowolnej liczby całkowitej.");
        System.out.println("Podaj n.");
        Integer n = getPositiveInt();
        TriangularNumberCalculator triangularNumberCalculator = new TriangularNumberCalculator();

        for (int i = 1; i <= n; i++) {
            System.out.printf("%d# = %d%n", i, triangularNumberCalculator.calculateBook(i));
        }
    }

    private static Integer getPositiveInt() {
        try {
            Scanner scanner = new Scanner(System.in);
            int r = Integer.parseInt(scanner.nextLine());
            if (r <= 0) {
                throw new AssertionError();
            }
            return r;
        } catch (Exception e) {
            System.out.println("Please type correct number");
            return getPositiveInt();
        }
    }
}
