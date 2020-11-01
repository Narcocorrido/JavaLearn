package chapter.e.task2;

import java.util.Objects;
import java.util.Scanner;

public class QuadraticEquation {

    private final Double a;
    private final Double b;
    private final Double c;
    private Double x1;
    private Double x2;
    private final int numberOfSolutions;

    private QuadraticEquation(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        Objects.requireNonNull(a);
        Objects.requireNonNull(b);
        Objects.requireNonNull(c);
        double delta = Math.pow(b, 2) - (4 * a * c);

        if (delta > 0) {
            x1 = (-b - Math.sqrt(delta)) / (2 * a);
            x2 = (-b + Math.sqrt(delta)) / (2 * a);
            numberOfSolutions = 2;
        } else if (delta == 0) {
            x1 = x2 = -b / (2 * a);
            numberOfSolutions = 1;
        } else {
            numberOfSolutions = 0;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public void printResult() {
        System.out.println(solution());
    }

    public String solution() {
        String equationFormatted = String.format("Trojmian %.2fx^2 + %.2fx + %.2f = 0 ", a, b, c);
        switch (numberOfSolutions) {
            case 0:
                return String.format("%s nie ma rozwiązań rzeczywistych.", equationFormatted);
            case 1:
                return String.format("%s ma jedno rozwiązanie x=%.2f", equationFormatted, x1);
            case 2:
                return String.format("%s ma dwa rozwiązania  x1=%.2f oraz x2=%.2f", equationFormatted, x1, x2);
            default:
                throw new AssertionError();
        }
    }

    public static class Builder {

        private Double a;
        private Double b;
        private Double c;

        public Builder readData() {

            this.a = getNonNullVariable("a");
            this.b = getVariable("b");
            this.c = getVariable("c");
            return this;
        }

        public QuadraticEquation build() {
            return new QuadraticEquation(this);
        }

        private Double getNonNullVariable(String paramName) {
            Double paramValue = getVariable(paramName);
            if (paramValue == 0) {
                System.out.printf("%s musi byc rozne od zera%n", paramName);
                return getNonNullVariable(paramName);
            }
            return paramValue;
        }

        private Double getVariable(String paramName) {
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
}
