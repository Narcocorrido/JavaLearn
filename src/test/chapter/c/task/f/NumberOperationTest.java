package chapter.c.task.f;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import chapter.c.number.control.RandomNumberGenerator;
import chapter.c.task.f.do_while.NumberOperationDoWhile;
import chapter.c.task.f.for_.NumberOperationFor;
import chapter.c.task.f.stream.NumberOperationStream;
import chapter.c.task.f.while_.NumberOperationWhile;

public class NumberOperationTest {

    @Test
    void compareSolutions() {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        List<Integer> numbers = randomNumberGenerator.getPositiveNumbers(5, 100);

        NumberOperationDoWhile numberOperationDoWhile = NumberOperationDoWhile.builder()
                .scope(numbers)
                .build();

        NumberOperationWhile numberOperationWhile = NumberOperationWhile.builder()
                .scope(numbers)
                .build();

        NumberOperationFor numberOperationFor = NumberOperationFor.builder()
                .scope(numbers)
                .build();

        NumberOperationStream numberOperationStream = NumberOperationStream.builder()
                .scope(numbers)
                .build();

        Assertions.assertEquals(numberOperationDoWhile.solution(), numberOperationWhile.solution());
        Assertions.assertEquals(numberOperationFor.solution(), numberOperationStream.solution());
        Assertions.assertEquals(numberOperationDoWhile.solution(), numberOperationFor.solution());
    }

}
