package chapter.e.task7;

public class FibonacciSequenceCalculator {

    public int calculate(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return calculate(i - 1) + calculate(i - 2);
        }
    }
}
