package chapter.d.table.b.twodimensional.b.arithmetic.task9;

import chapter.d.table.b.twodimensional.TwoDimensionalTable;

public class Main {
    /**
     * Dane są dwie macierze 10x10 o nazwach a i b. Macierz a zawiera elementy przedstawione poniżej.
     * 1 1 1 1 1 1 1 1 1 1
     * 1 1 1 1 1 1 1 1 1 1
     * 1 1 1 1 1 1 1 1 1 1
     * 1 1 1 1 1 1 1 1 1 1
     * 1 1 1 1 1 1 1 1 1 1
     * 1 1 1 1 1 1 1 1 1 1
     * 1 1 1 1 1 1 1 1 1 1
     * 1 1 1 1 1 1 1 1 1 1
     * 1 1 1 1 1 1 1 1 1 1
     * 1 1 1 1 1 1 1 1 1 1
     * <p>
     * Macierz b ma postać
     * 2 2 2 2 2 2 2 2 2 2
     * 2 2 2 2 2 2 2 2 2 2
     * 2 2 2 2 2 2 2 2 2 2
     * 2 2 2 2 2 2 2 2 2 2
     * 2 2 2 2 2 2 2 2 2 2
     * 2 2 2 2 2 2 2 2 2 2
     * 2 2 2 2 2 2 2 2 2 2
     * 2 2 2 2 2 2 2 2 2 2
     * 2 2 2 2 2 2 2 2 2 2
     * 2 2 2 2 2 2 2 2 2 2
     * Program, który dodaje obie macierze i wyświetla na ekranie komputera wynik dodawania c = a + b.
     */
    public static void main(String[] args) {
        int[][] matrixA = TwoDimensionalTable.createPredefinedTable(10, 1);
        int[][] matrixB = TwoDimensionalTable.createPredefinedTable(10, 2);

        int[][] matrixC = addMatrix(matrixA, matrixB);

        System.out.println("Macierz a.");
        TwoDimensionalTable.printTable(matrixA);
        System.out.println();

        System.out.println("Macierz b.");
        TwoDimensionalTable.printTable(matrixB);
        System.out.println();

        System.out.println("Macierz c = a + b.");
        TwoDimensionalTable.printTable(matrixC);
        System.out.println();
    }

    private static int[][] addMatrix(int[][] matrixA, int[][] matrixB) {
        int[][] matrixC = new int[matrixA.length][matrixA[0].length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        return matrixC;
    }
}
