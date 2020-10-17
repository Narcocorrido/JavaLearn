package chapter.b.task1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Triangle {
    private final int sideA;
    private final int sideB;
    private final int sideC;
    private final boolean isRectangular;

    public Triangle(Builder builder) {
        this.sideA = builder.sideA;
        this.sideB = builder.sideB;
        this.sideC = builder.sideC;
        this.isRectangular = builder.isRectangular;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Integer getSideA() {
        return sideA;
    }

    public Integer getSideB() {
        return sideB;
    }

    public Integer getSideC() {
        return sideC;
    }

    public boolean isRectangular() {
        return isRectangular;
    }

    public static class Builder {
        int sideA;
        int sideB;
        int sideC;
        boolean isRectangular;

        public Builder sideA(int sideA) {
            this.sideA = sideA;
            return this;
        }

        public Builder sideB(int sideB) {
            this.sideB = sideB;
            return this;
        }

        public Builder sideC(int sideC) {
            this.sideC = sideC;
            return this;
        }

        public Triangle build() {
            if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
                throw new AssertionError();
            }
            this.isRectangular = isRectangular();
            return new Triangle(this);
        }

        public boolean isRectangular() {
            List<Integer> collect = Stream.of(sideA, sideB, sideC)
                    .sorted(Integer::compareTo)
                    .collect(Collectors.toList());

            Integer min = collect.get(0);
            Integer mid = collect.get(1);
            Integer max = collect.get(2);

            return min * min + mid * mid == max * max;
        }
    }

}
