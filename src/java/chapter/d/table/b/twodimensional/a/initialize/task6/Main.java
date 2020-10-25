package chapter.d.table.b.twodimensional.a.initialize.task6;

import chapter.d.table.b.twodimensional.TwoDimensionalTable;

public class Main {
    /**
     * Program, który w zadeklarowanej tablicy dwuwymiarowej 10x10 o nazwie macierz umieszcza liczby od 0 do 9 zgodnie
     * z załączoną poniżej interpretacją graficzną. Program dodatkowo powinien obliczać sumę wyróżnionych elementów.
     * 0 0 0 0 0 0 0 0 0 0
     * 0 0 0 0 0 0 0 0 1 0
     * 0 0 0 0 0 0 0 2 0 0
     * 0 0 0 0 0 0 3 0 0 0
     * 0 0 0 0 0 4 0 0 0 0
     * 0 0 0 0 5 0 0 0 0 0
     * 0 0 0 6 0 0 0 0 0 0
     * 0 0 7 0 0 0 0 0 0 0
     * 0 8 0 0 0 0 0 0 0 0
     * 9 0 0 0 0 0 0 0 0 0
     */
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        int lengthCol = matrix.length;
        int lengthRow = matrix[0].length;
        int sum = 0;
        for (int i = 0; i < lengthCol; i++) {
            for (int j = 0; j < lengthRow; j++) {
                if (i + j == 9) {
                    int value = i;
                    matrix[i][j] = value;
                    sum += value;
                }
            }
        }

        TwoDimensionalTable.printTable(matrix);
        System.out.printf("Suma wyróżnionych elementów w tablicy wynosi %d", sum);
    }
}
