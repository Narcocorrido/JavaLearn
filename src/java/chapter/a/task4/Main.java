package chapter.a.task4;

import java.util.Scanner;

public class Main {
    /**
     * Program, który oblicza objętość kuli o prommieniu r. Wartość promienia wprowadzamy z klawiatury.
     * W programie należy przyjąć, że zmienne: promień r oraz objętość są typu double (rzeczywistego).
     * Dla tych zmiennych należy przyjąć format wyświetlania na ekranie z dokładnością do dwóch miejsc po przecinku.
     */
    public static void main(String[] args) {

        System.out.println("Program oblicza objętość kuli.");
        System.out.println("Podaj promień r.");
        Scanner scanner = new Scanner(System.in);
        Double r = getPositiveDouble(scanner);

        Sphere sphere = new Sphere(r);
        double volume = sphere.getVolume();

        System.out.printf("Objętość kuli o promieniu r = %.2f wynosi  %.2f.", r, volume);
    }

    private static Double getPositiveDouble(Scanner in) {
        try {
            double r = Double.parseDouble(in.nextLine());
            if (r <= 0) {
                throw new AssertionError();
            }
            return r;
        } catch (Exception e) {
            System.out.println("Please type correct number");
            return getPositiveDouble(in);
        }
    }
}
