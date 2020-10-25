package chapter.a.task1;

import java.util.Scanner;

public class Main {
    /**
     * Program który oblicza pole prostokąta. Wartości boków a i b wprowadzamy z klawiatury.
     * W programie należy przyjąć, że zmienna a, b oraz pole są typu double (rzeczywistego)
     **/
    public static void main(String[] args) {
        System.out.println("Program oblicza pole prostokąta.");

        Scanner in = new Scanner(System.in);//lub new BufferedReader(new InputStreamReadr(System.in))

        System.out.println("Podaj bok a.");
        Double a = getDouble(in);

        System.out.println("Podaj bok b.");
        Double b = getDouble(in);

        Rectangle rectangle = new Rectangle(a, b);
        calculateResult(rectangle);
    }

    private static void calculateResult(Rectangle rectangle) {
        String message = "Pole prostokąta o boku a = %s i boku b = %s wynosi %s.";
        String formattedMessage = String.format(message, rectangle.getA(), rectangle.getB(), rectangle.getArea());
        System.out.println(formattedMessage);
    }

    private static Double getDouble(Scanner in) {
        try {
            return Double.valueOf(in.nextLine());
        } catch (Exception e) {
            System.out.println("Please type correct number");
            return getDouble(in);
        }
    }
}
