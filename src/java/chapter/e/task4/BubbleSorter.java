package chapter.e.task4;

import java.util.Random;

public class BubbleSorter {

    private final int[] unsorted;
    private final int[] sorted;

    private BubbleSorter(Builder builder) {
        unsorted = new Random()
                .ints(builder.numbers, 0, builder.randomExclusiveMax)
                .toArray();

        sorted = bubbleSort(unsorted);
    }

    public static Builder builder() {
        return new Builder();
    }

    public void printSolution() {
        System.out.println("Liczyb nieposortowane to:");
        printTable(unsorted);
        System.out.println();
        System.out.println("Liczyb posortowane to:");
        printTable(sorted);
    }

    private int[] bubbleSort(int[] input) {
        int[] output = input.clone();
        for (int i = 0; i < output.length; i++) {
            int currentBubble = output[i];
            for (int j = i; j > 0; j--) {
                int aboveBubble = output[j - 1];
                if (currentBubble < aboveBubble) {
                    output[j - 1] = currentBubble;
                    output[j] = aboveBubble;
                }
            }
        }

        return output;
    }

    private void printTable(int[] input) {
        for (int j : input) {
            System.out.print(j + "\t");
        }
    }

    public static class Builder {

        private long numbers;
        private int randomExclusiveMax;

        public BubbleSorter build() {
            return new BubbleSorter(this);
        }

        public Builder numbers(long numbers) {
            this.numbers = numbers;
            return this;
        }

        public Builder randomExclusiveMax(int randomExclusiveMax) {
            this.randomExclusiveMax = randomExclusiveMax;
            return this;
        }
    }
}
