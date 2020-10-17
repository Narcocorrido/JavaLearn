package chapter.b.task4;

import java.util.Objects;

public class LinearEquation {

    private final Double a;
    private final Double b;
    private final Double c;
    private final Double x;

    private LinearEquation(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        Objects.requireNonNull(a);
        Objects.requireNonNull(b);
        Objects.requireNonNull(c);
        x = (c - b) / a;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String solution() {
        String equationFormatted = String.format("Dla równania %.2fx + %.2f = %.2f", a, b, c);
        return String.format("%s x=%.2f", equationFormatted, x);
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

        public LinearEquation build() {
            return new LinearEquation(this);
        }
    }
}
