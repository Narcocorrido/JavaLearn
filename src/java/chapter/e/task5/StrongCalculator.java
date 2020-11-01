package chapter.e.task5;

public class StrongCalculator {

    public int calculateStrongBook(int i) {
        if (i >= 2) {
            return calculateStrongBook(i - 1) * i;
        }

        return 1;
    }
}
