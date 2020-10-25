package chapter.d.table.b.twodimensional.a.initialize.task4;

import chapter.d.table.b.twodimensional.TwoDimensionalTable;

public class Main {
    /**
     * Program, który w zadeklarowanej tablicy dwuwymiarowej 10x10 o nazwie macierz umieszcza na przekątnej od 0 do 9,
     * a poza przekątną liczbę 0. Dodatkowo program powinien obliczać sumę wartośći elementów wyróżnionych w tablicy
     * (znajdujących się na przekątnej).
     */
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        int lengthCol = matrix.length;
        int lengthRow = matrix[0].length;
        int sum = 0;
        for (int i = 0; i < lengthCol; i++) {
            for (int j = 0; j < lengthRow; j++) {
                if (i == j) {
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
