package chapter.e.task6;

public class TriangularNumberCalculator {

    public int calculateBook(int i) {
        if (i >= 2) {
            return calculateBook(i - 1) + i;
        }

        return 1;
    }
}
