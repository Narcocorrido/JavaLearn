package chapter.f.file.task3;

import java.io.IOException;

import chapter.d.table.b.twodimensional.TwoDimensionalTable;

public class Main {
    /**
     * Zgodnie z zasadami programowania obiektowego. Program, który tablicę a o wymiarach 10x10 o postaci:
     * 0 0 0 0 0 0 0 0 0 0
     * 1 1 1 1 1 1 1 1 1 1
     * 0 0 0 0 0 0 0 0 0 0
     * 0 0 0 0 0 0 0 0 0 0
     * 0 0 0 0 0 0 0 0 0 0
     * 0 0 0 0 0 0 0 0 0 0
     * 0 0 0 0 0 0 0 0 0 0
     * 0 0 0 0 0 0 0 0 0 0
     * 0 0 0 0 0 0 0 0 0 0
     * 0 0 0 0 0 0 0 0 0 0
     * przekształca w tablicę b o postaci:
     * 0 1 0 0 0 0 0 0 0 0
     * 0 1 0 0 0 0 0 0 0 0
     * 0 1 0 0 0 0 0 0 0 0
     * 0 1 0 0 0 0 0 0 0 0
     * 0 1 0 0 0 0 0 0 0 0
     * 0 1 0 0 0 0 0 0 0 0
     * 0 1 0 0 0 0 0 0 0 0
     * 0 1 0 0 0 0 0 0 0 0
     * 0 1 0 0 0 0 0 0 0 0
     * 0 1 0 0 0 0 0 0 0 0
     * i zapisuje ją do pliku tekstowego o nazwie dane.txt, a następnie odczytuje ją z tego pliku i wyświetla na ekranie
     * komputera.
     */
    public static void main(String[] args) throws IOException {
        TransformMatrixSaver transformMatrixSaver = new TransformMatrixSaver();
        int[][] matrix = transformMatrixSaver.readFile();
        TwoDimensionalTable.printTable(matrix);
    }
}
