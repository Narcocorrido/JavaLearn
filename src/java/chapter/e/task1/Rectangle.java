package chapter.e.task1;

import java.util.Scanner;

public class Rectangle {
    private final Double a;
    private final Double b;
    private final Double area;

    private Rectangle(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.area = a * b;
    }

    public static Builder builder() {
        return new Builder();
    }

    public void printResult() {
        String message = "Pole prostokąta o boku a = %.2f i boku b = %.2f wynosi %.2f.";
        String formattedMessage = String.format(message, this.a, this.b, this.area);
        System.out.println(formattedMessage);
    }

    public static class Builder {

        private Scanner in = new Scanner(System.in);
        private Double a;
        private Double b;

        public Rectangle build() {
            return new Rectangle(this);
        }

        public Builder readData() {
            System.out.println("Podaj bok a.");
            this.a = getDouble(in);
            System.out.println("Podaj bok b.");
            this.b = getDouble(in);
            return this;
        }

        private Double getDouble(Scanner in) {
            try {
                return Double.valueOf(in.nextLine());
            } catch (Exception e) {
                System.out.println("Please type correct number");
                return getDouble(in);
            }
        }
    }
}
