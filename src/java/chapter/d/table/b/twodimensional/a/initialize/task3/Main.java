package chapter.d.table.b.twodimensional.a.initialize.task3;

import chapter.d.table.b.twodimensional.TwoDimensionalTable;

public class Main {
    /**
     * Program, który w zadeklarowanej tablicy dwuwymiarowej 10x10 o nazwie macierz  umieszcza na przekątnej liczbę 1,
     * a poza przekątną - 0. Dodatkowo program powinien obliczać sumę wartości elementów wyróżnionych w tablicy,
     * tj. tych znajdujących się na jej przekątnej.
     */
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        int lengthCol = matrix.length;
        int lengthRow = matrix[0].length;
        int sum = 0;
        for (int i = 0; i < lengthCol; i++) {
            for (int j = 0; j < lengthRow; j++) {
                if (i == j) {
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
