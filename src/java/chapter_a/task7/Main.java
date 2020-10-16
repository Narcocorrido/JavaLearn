package chapter_a.task7;

import java.util.Scanner;

/**
 * Program, który oblicza sumę, różnicę, iloczyn i iloraz dla dwóch liczb x i y wprowadzanych z klawiatury.
 * W programi należy założyć, że zmienne x i y są typu float (rzeczywistego). Dla zmiennych x, y, suma, różnica,
 * iloczyn i iloraz należy przyjąć format ich wyświetlania na ekranie z dokładnością do dwóch miejsc po przecinku.
 */
public class Main {
    public static void main(String[] args) {
        System.out.printf("Program oblicza sumę, różnicę, iloczyn i iloraz %n" +
                "dla dwóch liczb x i y wprowadzanych z klawiatury. %n");

        Float x = getVariable("x");
        Float y = getVariable("y");

        System.out.printf("Dla liczb: x = %.2f i y = %.2f %n", x, y);
        System.out.printf("Suma = %.2f %n", x + y);
        System.out.printf("Różnica = %.2f %n", x - y);
        System.out.printf("Iloczyn = %.2f %n", x * y);
        System.out.printf("Iloraz = %.2f %n", x / y);
    }

    private static Float getVariable(String paramName) {
        System.out.printf("Podaj %s. %n", paramName);
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        try {
            return Float.valueOf(line);
        } catch (NumberFormatException e) {
            System.out.println("Niepoprawna wartość podaj liczbę!");
            return getVariable(paramName);
        }
    }
}
