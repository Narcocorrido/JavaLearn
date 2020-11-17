package chapter.f.file.task2;

import java.io.IOException;

import chapter.d.table.b.twodimensional.TwoDimensionalTable;

public class Main {
    /**
     * Zgodnie z zasadami programowania obiektowego. Program, który tablicę 10x10 o postaci:
     * 1 0 0 0 0 0 0 0 0 0
     * 0 1 0 0 0 0 0 0 0 0
     * 0 0 1 0 0 0 0 0 0 0
     * 0 0 0 1 0 0 0 0 0 0
     * 0 0 0 0 1 0 0 0 0 0
     * 0 0 0 0 0 1 0 0 0 0
     * 0 0 0 0 0 0 1 0 0 0
     * 0 0 0 0 0 0 0 1 0 0
     * 0 0 0 0 0 0 0 0 1 0
     * 0 0 0 0 0 0 0 0 0 1
     * zapisuje do pliku tekstowego dane.txt, a następnie odczytuje z niego zapisane dane i wyświetla na ekranie
     * komputera.
     */
    public static void main(String[] args) throws IOException {
        MatrixSaver matrixSaver = new MatrixSaver();
        int[][] matrix = matrixSaver.readFile();
        TwoDimensionalTable.printTable(matrix);
    }
}
