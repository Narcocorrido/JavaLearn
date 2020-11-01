package chapter.e.task4;

public class Main {
    /**
     * Zgodnie z zasadami programowania obiektowego.
     * Program, który sortuje n liczb (w programie jest ich sześć).
     */
    public static void main(String[] args) {
        BubbleSorter bubbleSorter = BubbleSorter.builder()
                .numbers(6)
                .randomExclusiveMax(100)
                .build();

        bubbleSorter.printSolution();
    }
}
