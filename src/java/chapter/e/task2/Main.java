package chapter.e.task2;

public class Main {
    /**
     * Program, który oblicza pierwiastki równania kwadratowego ax+bx+c=0 z wykorzystaniem instrukcji wyboru
     * switch ... case zgodnie z zasadami programowania obiektowego.
     */
    public static void main(String[] args) {
        System.out.printf("Program oblicza pierwiastki rownania ax^2 + bx + c = 0.%n");

        QuadraticEquation quadraticEquation = QuadraticEquation.builder()
                .readData()
                .build();

        quadraticEquation.printResult();
    }
}
