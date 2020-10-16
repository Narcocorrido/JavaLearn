package chapter_b.task1;

import java.util.Scanner;

public class Main {
    /**
     * Program, który sprawdza dla trzech boków trójkąta a, b i c wprowadzonych z klawiatury,
     * czy tworzą one trójkąt prostokątny (zakładamy, że a > 0, b > 0, c > 0).
     */
    public static void main(String[] args) {
        Triangle triangle = createTriangle();

        System.out.printf("Boki: %n" +
                "a = %s %n" +
                "b = %s %n" +
                "c = %s %n", triangle.getSideA(), triangle.getSideB(), triangle.getSideC());

        if (triangle.isRectangular()) {
            System.out.println("Tworzą trójkąt prostokątny.");
        } else {
            System.out.println("Nie tworzą trójkąta prostokątnego.");
        }
    }

    private static Triangle createTriangle() {
        Integer a = getVariable("a");
        Integer b = getVariable("b");
        Integer c = getVariable("c");

        return Triangle.builder()
                .sideA(a)
                .sideB(b)
                .sideC(c)
                .build();
    }

    private static Integer getVariable(String paramName) {
        System.out.printf("Podaj bok %s. %n", paramName);
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        try {
            Integer integer = Integer.valueOf(line);
            if (integer <= 0) {
                throw new NumberFormatException();
            }
            return integer;
        } catch (NumberFormatException e) {
            System.out.println("Oczekiwana jest liczba dodatnia!");
            return getVariable(paramName);
        }
    }
}
