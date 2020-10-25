package chapter.d.table.a.onedimensional.task1;

public class Main {
    /**
     * Program, który w 10-elementowej tablicy jednowymiarowej o nazwie dane umieszcza liczby od 0 do 9.
     */
    public static void main(String[] args) {
        int dane[] = new int[10];

        for (int i = 0; i < dane.length; i++) {
            dane[i] = i;
        }

        int i = 0;
        for (int dana : dane) {
            System.out.printf("dane[%d]=%d\n", i, dana);
            i++;
        }
    }
}
