package chapter.c.task.f.for_;

import java.util.List;
import java.util.Objects;

import chapter.c.task.f.NumberOperation;

public class NumberOperationFor implements NumberOperation {

    private final List<Integer> scope;
    private int min;
    private int max;
    private double average;

    private NumberOperationFor(Builder builder) {
        Objects.requireNonNull(builder.scope);
        scope = builder.scope;
        calculateParams(scope);
    }

    public static Builder builder() {
        return new Builder();
    }

    private void calculateParams(List<Integer> scope) {
        int currentMin = scope.get(0);
        int currentMax = scope.get(0);
        int sum = 0;

        for (int i = 0; i < scope.size(); i++) {
            int currentNumber = scope.get(i);
            if (currentMin > currentNumber) {
                currentMin = currentNumber;
            }
            if (currentMax < currentNumber) {
                currentMax = currentNumber;
            }

            sum += currentNumber;
        }

        this.average = (double) sum / (double) scope.size();
        this.min = currentMin;
        this.max = currentMax;
    }

    @Override
    public String solution() {
        return String.format("Wylosowano liczby: %s \n" +
                "najwieksza liczba to %d, \n" +
                "najmniejsza liczba to %d, \n" +
                "średnia %.1f", scope.toString(), max, min, average);
    }

    public static class Builder {

        private List<Integer> scope;

        public Builder scope(List<Integer> value) {
            this.scope = value;
            return this;
        }

        public NumberOperationFor build() {
            return new NumberOperationFor(this);
        }
    }
}
