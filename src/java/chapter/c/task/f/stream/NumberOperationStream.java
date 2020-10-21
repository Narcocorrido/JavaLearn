package chapter.c.task.f.stream;

import java.util.List;
import java.util.Objects;

import chapter.c.task.f.NumberOperation;

public class NumberOperationStream implements NumberOperation {

    private final int min;
    private final int max;
    private final double average;
    private final List<Integer> scope;

    private NumberOperationStream(Builder builder) {
        Objects.requireNonNull(builder.scope);

        scope = builder.scope;
        average = calculateAverage(scope);

        this.min = scope.stream()
                .min(Integer::compareTo)
                .orElseThrow(AssertionError::new);

        this.max = scope.stream()
                .max(Integer::compareTo)
                .orElseThrow(AssertionError::new);
    }

    public static Builder builder() {
        return new Builder();
    }

    private double calculateAverage(List<Integer> scope) {
        Integer sum = scope.stream()
                .reduce(0, Integer::sum);

        return (double) sum / (double) scope.size();
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

        public NumberOperationStream build() {
            return new NumberOperationStream(this);
        }
    }
}
