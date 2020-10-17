package chapter.b.task4;

import java.util.Scanner;

public class Main {
    /**
     * Program, który oblicza wartość x z równania ax + b = c.
     * Wartości a,b i c należą do zbioru liczb rzeczywistych i są wprowadzane z kalwiatury.
     * Dodatkowo należy zabezpieczyć program na wypadek sytuacji, kiedy wprowadzona wartość a będzie równa zero.
     * Dla zmiennych a, b, c oraz x należy przyjąć format wyświetlania ich na ekranie z  dokładnością do dwóch
     * miejsc po przecinku.
     */
    public static void main(String[] args) {
        System.out.println("Program oblicza wartość x z równania liniowego ax + b = c");

        LinearEquation linearEquation = LinearEquation.builder()
                .a(getNonNullVariable("a"))
                .b(getVariable("b"))
                .c(getVariable("c"))
                .build();

        System.out.printf(linearEquation.solution());
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
