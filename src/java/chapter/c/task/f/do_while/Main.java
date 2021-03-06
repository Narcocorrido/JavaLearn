package chapter.c.task.f.do_while;

import java.util.List;

import chapter.c.task.number.control.RandomNumberGenerator;

public class Main {
    /**
     * Program, który za pomocą instrukcji do ... while znajduje największą i najmniejszą liczbę ze zbioru n wylosowanych
     * liczb całkowitych od 0 do 99 (w zadaniu n = 5) oraz oblicza średnią ze wszystkich wylosowanych liczb.
     */
    public static void main(String[] args) {
        System.out.println("Program losuje 5 liczb z zakresu od 0 do 99, znajduej extrema oraz oblicza średnią.");
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        List<Integer> numbers = randomNumberGenerator.getPositiveNumbers(5, 100);

        NumberOperationDoWhile numberOperationDoWhile = NumberOperationDoWhile.builder()
                .scope(numbers)
                .build();

        System.out.println(numberOperationDoWhile.solution());
    }
}
