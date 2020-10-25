package chapter.d.table.e.for_each.task16;

public class Main {
    /**
     * Program, który w tablicy jednowymiarowej o nazwie dane umieszcza liczby od 1 do 100, a następnie sumuje liczby
     * parzyste i nieparzyste znajdujące się w tym przedziale.
     */
    public static void main(String[] args) {
        System.out.println("Program sumuje liczby parzyste i nieparzyste znajdujące się w przedziale od 1 do 100, \n" +
                "i znajdujące się w tablicy data.");
        int[] data = getInput();

        int evenNumbersSum = 0;
        int oddNumbersSum = 0;
        for (int singleData : data) {
            if (singleData % 2 == 0) {
                evenNumbersSum += singleData;
            } else {
                oddNumbersSum += singleData;
            }
        }

        System.out.printf("Suma liczb parzystych od 1 do 100 wynosi %d%n", evenNumbersSum);
        System.out.printf("Suma liczb nieparzystych od 1 do 100 wynosi %d%n", oddNumbersSum);
    }

    private static int[] getInput() {
        int[] data = new int[100];

        for (int i = 0; i < data.length; i++) {
            data[i] = i + 1;
        }
        return data;
    }
}
