package chapter.b.task2;

import java.util.Scanner;

public class Main {
    /**
     * Program, który oblicza pierwiastki równania kwadratowego ax^2 + bx + c = 0 z wykorzystaniem instrukcji
     * warunkowej if, gdzie zmienne a,b i c to liczby rzeczywiste wprowadzane z klawiatury.
     * Dla zmiennych a,b,c x1 oraz x2 należy przyjąć format wyświetlania ich na ekranie z dokładnością
     * do dwóch miejsc po przecinku.
     */
    public static void main(String[] args) {
        System.out.printf("Program oblicza pierwiastki rownania ax^2 + bx + c = 0.%n");

        Equation equation = Equation.builder()
                .a(getNonNullVariable("a"))
                .b(getVariable("b"))
                .c(getVariable("c"))
                .build();

        System.out.printf(equation.solution());
    }

    private static Double getNonNullVariable(String paramName) {
        Double a = getVariable(paramName);
        if (a == 0) {
            System.out.println("a musi byc rozne od zera");
            return getNonNullVariable(paramName);
        }
        return a;
    }

    private static Double getVariable(String paramName) {
        System.out.printf("Podaj %s. %n", paramName);
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        try {
            return Double.valueOf(line);
        } catch (NumberFormatException e) {
            System.out.println("Oczekiwana jest liczba!");
            return getVariable(paramName);
        }
    }
}
