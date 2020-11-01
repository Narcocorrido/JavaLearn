package chapter.e.task7;

import java.util.Scanner;

public class Main {
    /**
     * Program, który znajduje 10 pierwszych liczb Fibonacciego i wyświetla je na ekranie komputera.
     */
    public static void main(String[] args) {
        System.out.println("Obliczanie dowolnej liczby całkowitej wyrazów ciągu Fibonacciego.");
        System.out.println("Podaj n.");
        Integer n = getPositiveInt();
        FibonacciSequenceCalculator fibonacciSequenceCalculator = new FibonacciSequenceCalculator();

        for (int i = 0; i <= n-1; i++) {
            System.out.printf("%d# = %d%n", i, fibonacciSequenceCalculator.calculate(i));
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
