package chapter.d.table.b.twodimensional.a.initialize.task8;

import chapter.d.table.b.twodimensional.TwoDimensionalTable;

public class Main {
    /**
     * Dane są dwie tablice dwuwymiarowe 10x10 o nazwach a i b. Tablica a zawiera elementy przedstawione poniżej.
     * 0 1 2 3 4 5 6 7 8 9
     * 0 1 2 3 4 5 6 7 8 9
     * 0 1 2 3 4 5 6 7 8 9
     * 0 1 2 3 4 5 6 7 8 9
     * 0 1 2 3 4 5 6 7 8 9
     * 0 1 2 3 4 5 6 7 8 9
     * 0 1 2 3 4 5 6 7 8 9
     * 0 1 2 3 4 5 6 7 8 9
     * 0 1 2 3 4 5 6 7 8 9
     * 0 1 2 3 4 5 6 7 8 9
     * Tablica b zawiera same zera. Program, który przepisuje zawartość, tablicy a do tablicy b (interpretacja
     * graficzna tablicy wynikowej poniżej), zamieniając kolumny na wiersze.
     * 0 0 0 0 0 0 0 0 0 0
     * 1 1 1 1 1 1 1 1 1 1
     * 2 2 2 2 2 2 2 2 2 2
     * 3 3 3 3 3 3 3 3 3 3
     * 4 4 4 4 4 4 4 4 4 4
     * 5 5 5 5 5 5 5 5 5 5
     * 6 6 6 6 6 6 6 6 6 6
     * 7 7 7 7 7 7 7 7 7 7
     * 8 8 8 8 8 8 8 8 8 8
     * 9 9 9 9 9 9 9 9 9 9
     */
    public static void main(String[] args) {
        int[][] matrixA = prepareMatrixA();

        int[][] matrixB = new int[10][10];
        int lengthCol = matrixB.length;
        int lengthRow = matrixB[0].length;

        for (int i = 0; i < lengthCol; i++) {
            for (int j = 0; j < lengthRow; j++) {
                matrixB[i][j] = matrixA[j][i];
            }
        }

        System.out.println("Wyświetlenie zawartości tablicy a");
        TwoDimensionalTable.printTable(matrixA);
        System.out.println();
        System.out.println("Wyświetlenie zawartości tablicy b");
        TwoDimensionalTable.printTable(matrixB);
    }

    private static int[][] prepareMatrixA() {
        int[][] matrix = new int[10][10];
        int lengthCol = matrix.length;
        int lengthRow = matrix[0].length;

        for (int i = 0; i < lengthCol; i++) {
            for (int j = 0; j < lengthRow; j++) {
                matrix[i][j] = j;
            }
        }
        return matrix;
    }
}
