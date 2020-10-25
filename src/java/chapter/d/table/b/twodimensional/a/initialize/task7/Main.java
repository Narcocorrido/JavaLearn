package chapter.d.table.b.twodimensional.a.initialize.task7;

import chapter.d.table.b.twodimensional.TwoDimensionalTable;

public class Main {
    /**
     * Program, który w zadeklarowanej tablicy dwuwymiarowej 10x10 umieszcza w pierwszej kolumnie liczby od 0 do 9, w
     * drugiej kwadraty tych liczb, natomiast w pozostałych kolumnach 0 (interpretacja graficzna tablicy poniżej).
     * Dodatkowo program powinien obliczać osobno sumę liczb znajdujących się w pierwszej oraz w drugiej kolumnie.
     * 0  0  0  0  0  0  0  0  0  0
     * 1  1  0  0  0  0  0  0  0  0
     * 2  4  0  0  0  0  0  0  0  0
     * 3  9  0  0  0  0  0  0  0  0
     * 4  16 0  0  0  0  0  0  0  0
     * 5  25 0  0  0  0  0  0  0  0
     * 6  36 0  0  0  0  0  0  0  0
     * 7  49 0  0  0  0  0  0  0  0
     * 8  64 0  0  0  0  0  0  0  0
     * 9  81 0  0  0  0  0  0  0  0
     */
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        int lengthCol = matrix.length;
        int lengthRow = matrix[0].length;
        int sumCol0 = 0;
        int sumCol1 = 0;
        for (int i = 0; i < lengthCol; i++) {
            for (int j = 0; j < lengthRow; j++) {
                switch (j) {
                    case 0:
                        matrix[i][j] = i;
                        sumCol0 += matrix[i][j];
                        break;
                    case 1:
                        matrix[i][j] = i * i;
                        sumCol1 += matrix[i][j];
                        break;
                }
            }
        }

        TwoDimensionalTable.printTable(matrix);
        System.out.printf("Suma liczb znajdujących się w pierwszej kolumnie to %d\n", sumCol0);
        System.out.printf("Suma liczb znajdujących się w drugiej kolumnie to %d\n", sumCol1);
    }
}
