package chapter.e.task1;

public class Main {
    /**
     * Program, który oblicza pole prostokąta zgodnie z zasadami programowania obiektowego.
     */
    public static void main(String[] args) {
        Rectangle rectangle = Rectangle.builder()
                .readData()
                .build();

        rectangle.printResult();
    }
}
