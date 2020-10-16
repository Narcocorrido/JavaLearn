package chapter_a.task3;

public class Main {
    /**
     * Program, który wyświetla na ekranie komputera pierwiastek kwadratowy z wartości predefiniowanej pi = 3,14..
     * Należy przyjąć format wyświetlania pierwiastka kwadratowego ze stałej pi z dokładnością do dwóch miejsc
     * po przecinku.
     */
    public static void main(String[] args) {
        double result = Math.sqrt(Math.PI);

        System.out.println("Program wyświetala pierwiastek kwadratowy");
        System.out.println("z liczby pi z dokładnością do dwóch miejsc po przecinku.");
        System.out.printf("Sqrt(Pi) = %.2f%n", result);
    }
}
