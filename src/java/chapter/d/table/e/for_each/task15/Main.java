package chapter.d.table.e.for_each.task15;

public class Main {
    /**
     * Program, który w tablicy jednowymiarowej o nazwie dane umieszcza liczby od 1 do 100, a następnie je sumuje.
     * Skorzystaj z właściwości pętli for-each.
     */
    public static void main(String[] args) {
        System.out.println("Program sumuje liczby w przedziale od 1 do 100 znajdujące się w tablicy data.");
        int[] data = getInput();

        int sum = 0;
        for (int singleData : data) {
            sum += singleData;
        }

        System.out.printf("Suma liczb od 1 do 100 wynosi %d.%n", sum);
    }

    private static int[] getInput() {
        int[] data = new int[100];

        for (int i = 0; i < data.length; i++) {
            data[i] = i + 1;
        }
        return data;
    }
}
