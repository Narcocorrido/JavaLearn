package chapter.d.table.a.onedimensional.task2;

public class Main {
    /**
     * Program, który w 10-elementowej tablicy jednowymiarowej o nazwie dane umieszcza liczby od 9 do 0.
     */
    public static void main(String[] args) {
        int tableSize = 10;
        int dane[] = new int[tableSize];

        for (int i = 0; i < dane.length; i++) {

            dane[i] = tableSize - 1 - i;
        }

        printTable(dane);
    }

    private static void printTable(int[] dane) {
        int i = 0;
        for (int dana : dane) {
            System.out.printf("dane[%d]=%d\n", i, dana);
            i++;
        }
    }
}
