package chapter.b.task2;

import java.util.Objects;

public class Equation {

    private final Double a;
    private final Double b;
    private final Double c;
    private Double delta;
    private Double x1;
    private Double x2;
    private int numberOfSolutions;

    private Equation(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        Objects.requireNonNull(a);
        Objects.requireNonNull(b);
        Objects.requireNonNull(c);
        delta = Math.pow(b, 2) - (4 * a * c);

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

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private Double a;
        private Double b;
        private Double c;

        public Builder a(Double value) {
            this.a = value;
            return this;
        }

        public Builder b(Double value) {
            this.b = value;
            return this;
        }

        public Builder c(Double value) {
            this.c = value;
            return this;
        }

        public Equation build() {
            return new Equation(this);
        }
    }

}
