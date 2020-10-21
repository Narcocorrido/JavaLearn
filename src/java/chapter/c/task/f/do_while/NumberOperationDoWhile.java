package chapter.c.task.f.do_while;

import java.util.List;
import java.util.Objects;

import chapter.c.task.f.NumberOperation;

public class NumberOperationDoWhile implements NumberOperation {

    private final int min;
    private final int max;
    private final double average;
    private final List<Integer> scope;

    private NumberOperationDoWhile(Builder builder) {
        Objects.requireNonNull(builder.scope);

        scope = builder.scope;

        average = calculateAverage(scope);

        this.min = calculateMin(scope);
        this.max = calculateMax(scope);
    }

    public static Builder builder() {
        return new Builder();
    }

    private Integer calculateMin(List<Integer> numbers) {
        int currentMin = numbers.get(0);
        int i = 0;
        do {
            if (currentMin > scope.get(i)) {
                currentMin = scope.get(i);
            }
            i++;
        } while (i < scope.size());

        return currentMin;
    }

    private Integer calculateMax(List<Integer> numbers) {
        int currentMax = numbers.get(0);

        int i = 0;
        do {
            if (currentMax < scope.get(i)) {
                currentMax = scope.get(i);
            }
            i++;
        } while (i < scope.size());

        return currentMax;
    }

    private double calculateAverage(List<Integer> scope) {
        int sum = 0;

        int i = 0;
        do {
            sum += scope.get(i);
            i++;
        } while (i < scope.size());

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

        public NumberOperationDoWhile build() {
            return new NumberOperationDoWhile(this);
        }
    }
}
