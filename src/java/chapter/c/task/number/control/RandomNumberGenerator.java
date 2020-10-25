package chapter.c.task.number.control;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomNumberGenerator {

    public List<Integer> getPositiveNumbers(long quantity, int lowerThan) {
        Random random = new Random();
        return random.ints(quantity, 0, lowerThan)
                .boxed()
                .collect(Collectors.toList());
    }
}
