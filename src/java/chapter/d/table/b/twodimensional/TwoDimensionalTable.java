package chapter.d.table.b.twodimensional;

public class TwoDimensionalTable {
    public static void printTable(int[][] table) {
        int lengthCol = table.length;
        int lengthRow = table[0].length;
        for (int i = 0; i < lengthCol; i++) {
            for (int j = 0; j < lengthRow; j++) {
                System.out.print(table[i][j] + "\t");
            }

            System.out.println();
        }
    }

    public static int[][] createPredefinedTable(int size, int initialValue) {
        int[][] createdTable = new int[size][size];
        int lengthCol = createdTable.length;
        int lengthRow = createdTable[0].length;
        for (int i = 0; i < lengthCol; i++) {
            for (int j = 0; j < lengthRow; j++) {
                createdTable[i][j] = initialValue;
            }
        }
        return createdTable;
    }
}
