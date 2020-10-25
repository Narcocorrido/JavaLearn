package chapter.d.table.b.twodimensional.a.initialize.task5;

import chapter.d.table.b.twodimensional.TwoDimensionalTable;

public class Main {
    /**
     * Program, który w zadeklarowanej tablicy dwuwymiaowej 10x10 o nazwie macierz umieszcza liczby 1 i 0 zgodnie z
     * przedstawioną poniżej interpretacją graficzną. Program dodatkowo powinien obliczać sumę wyróżnionych elementów.
     * 0 0 0 0 0 0 0 0 0 1
     * 0 0 0 0 0 0 0 0 1 0
     * 0 0 0 0 0 0 0 1 0 0
     * 0 0 0 0 0 0 1 0 0 0
     * 0 0 0 0 0 1 0 0 0 0
     * 0 0 0 0 1 0 0 0 0 0
     * 0 0 0 1 0 0 0 0 0 0
     * 0 0 1 0 0 0 0 0 0 0
     * 0 1 0 0 0 0 0 0 0 0
     * 1 0 0 0 0 0 0 0 0 0
     */
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        int lengthCol = matrix.length;
        int lengthRow = matrix[0].length;
        int sum = 0;
        for (int i = 0; i < lengthCol; i++) {
            for (int j = 0; j < lengthRow; j++) {
                if (i + j == 9) {
                    int value = 1;
                    matrix[i][j] = value;
                    sum += value;
                }
            }
        }

        TwoDimensionalTable.printTable(matrix);
        System.out.printf("Suma wyróżnionych elementów w tablicy wynosi %d", sum);
    }
}
