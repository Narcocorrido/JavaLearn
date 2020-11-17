package chapter.f.file.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import chapter.d.table.b.twodimensional.TwoDimensionalTable;

public class MatrixSaver {
    private static final String FILE_NAME = "data.txt";
    private static final int TABLE_SIZE = 10;

    public MatrixSaver() throws IOException {
        int[][] matrix = getMatrix();
        saveMatrix(matrix);
    }

    public int[][] readFile() throws IOException {
        System.out.printf("Odczytuje dane z pliku %s%n", FILE_NAME);
        int[][] table = new int[TABLE_SIZE][TABLE_SIZE];
        FileReader fileReader = new FileReader(FILE_NAME);

        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            int lengthCol = table.length;
            int lengthRow = table[0].length;
            for (int i = 0; i < lengthCol; i++) {
                for (int j = 0; j < lengthRow; j++) {
                    int read = bufferedReader.read();
                    table[i][j] = read;
                }
            }
        }

        return table;
    }

    private int[][] getMatrix() {
        System.out.printf("Tworzymy tablicę %dx%d%n", TABLE_SIZE, TABLE_SIZE);
        int[][] table = new int[TABLE_SIZE][TABLE_SIZE];
        int lengthCol = table.length;
        int lengthRow = table[0].length;
        for (int i = 0; i < lengthCol; i++) {
            for (int j = 0; j < lengthRow; j++) {
                if (i == j) {
                    table[i][j] = 1;
                }
            }
        }

        TwoDimensionalTable.printTable(table);
        System.out.println();
        return table;
    }

    private void saveMatrix(int[][] matrix) throws IOException {
        System.out.printf("Zapisuje dane do pliku %s%n", FILE_NAME);
        try (FileWriter fileWriter = new FileWriter(FILE_NAME)) {

            int lengthCol = matrix.length;
            int lengthRow = matrix[0].length;
            for (int i = 0; i < lengthCol; i++) {
                for (int j = 0; j < lengthRow; j++) {
                    int value = matrix[i][j];
                    fileWriter.write((char) value);
                }
            }
        }
    }
}
