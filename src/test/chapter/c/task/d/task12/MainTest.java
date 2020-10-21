package chapter.c.task.d.task12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    public void sum() {
        int i = Main.sumNumbers(1, 10);
        Assertions.assertEquals(30, i);
    }
}