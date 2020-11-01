package chapter.e.task3;

import java.util.Random;

import chapter.d.table.b.twodimensional.TwoDimensionalTable;

public class RandomDiagonalTable {
    private final int[][] randomTable;
    private final int sumMatrix;

    private RandomDiagonalTable(Builder builder) {
        randomTable = initializeTable(builder.tableSize, builder.randomExclusiveMax);
        sumMatrix = sumValues(randomTable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public void printResult() {
        System.out.printf("Suma elementów w tablicy wynosi %d%n", sumMatrix);
        TwoDimensionalTable.printTable(randomTable);
    }

    private int sumValues(int[][] randomTable) {
        int lengthCol = randomTable.length;
        int lengthRow = randomTable[0].length;
        int sum = 0;
        for (int i = 0; i < lengthCol; i++) {
            for (int j = 0; j < lengthRow; j++) {

                sum += randomTable[i][j];

            }
        }

        return sum;
    }

    private int[][] initializeTable(int tableSize, int max) {
        int[][] emptyMatrix = new int[tableSize][tableSize];

        int lengthCol = emptyMatrix.length;
        int lengthRow = emptyMatrix[0].length;
        int sum = 0;
        for (int i = 0; i < lengthCol; i++) {
            for (int j = 0; j < lengthRow; j++) {
                if (i == j) {
                    emptyMatrix[i][j] = new Random().nextInt(10);
                }
            }
        }

        return emptyMatrix;
    }

    public static class Builder {

        private int tableSize;
        private int randomExclusiveMax;

        public RandomDiagonalTable build() {
            return new RandomDiagonalTable(this);
        }

        public Builder tableSize(int tableSize) {
            this.tableSize = tableSize;
            return this;
        }

        public Builder randomExclusiveMax(int randomExclusiveMax) {
            this.randomExclusiveMax = randomExclusiveMax;
            return this;
        }
    }
}
