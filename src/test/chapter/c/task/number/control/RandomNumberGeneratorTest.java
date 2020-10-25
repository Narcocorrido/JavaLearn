package chapter.c.task.number.control;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RandomNumberGeneratorTest {

    RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

    @Test
    void getPositiveNumbers() {
        List<Integer> positiveNumbers = randomNumberGenerator.getPositiveNumbers(100L, 2);

        Assertions.assertTrue(positiveNumbers.stream().allMatch(i -> i < 2));
        Assertions.assertTrue(positiveNumbers.stream().noneMatch(i -> i == 2));
        Assertions.assertEquals(100, positiveNumbers.size());
    }
}