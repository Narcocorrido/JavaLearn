package chapter.e.task3;

public class Main {
    /**
     * Zgodnie z zasadami programowania obiektowego.
     * Program, który w tablicy 10x10 umieszcza losowo na przekątnej liczby od 0 do 9, a poza przekątną zera.
     * Dodatkowo program oblicza sume liczb znajdujących się na przekątnej.
     */
    public static void main(String[] args) {
        RandomDiagonalTable randomDiagonalTable = RandomDiagonalTable.builder()
                .tableSize(10)
                .randomExclusiveMax(10)
                .build();

        randomDiagonalTable.printResult();
    }
}
