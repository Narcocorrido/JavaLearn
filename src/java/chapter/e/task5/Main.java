package chapter.e.task5;

import java.util.Scanner;

public class Main {
    /**
     * Program, który rekurencyjnie oblicza kolejne wartości n! dla n = 10 i wynik wyświetla na ekranie komputera.
     */
    public static void main(String[] args) {
        System.out.println("Obliczanie silni dla dowolnej liczby całkowitej.");
        System.out.println("Podaj n.");
        Integer n = getPositiveInt();
        StrongCalculator strongCalculator = new StrongCalculator();

        for (int i = 1; i <= n; i++) {
            System.out.printf("%d! = %d%n", i, strongCalculator.calculateStrongBook(i));
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
