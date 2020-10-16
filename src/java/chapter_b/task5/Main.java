package chapter_b.task5;

import java.util.Random;
import java.util.Scanner;

public class Main {
    /**
     * Program, którym użytkownik zgaduje losową liczbę z przedziału id 0 do 9 generowaną przez komputer.
     */
    public static void main(String[] args) {
        System.out.println("Zgadnij liczbe z przedziału od 0 do 9");
        int random = getPositiveRandomNumber();

        guessNumber(random);
    }

    private static void guessNumber(int random) {
        Integer number = getNumber();
        if (number == random) {
            System.out.println("Gratulacje zgadłeś!");
        } else {
            System.out.println("Spróbuj ponownie");
            guessNumber(random);
        }
    }

    private static int getPositiveRandomNumber() {
        Random random = new Random();
        int i = random.ints()
                .filter(num -> num > 0)
                .findFirst()
                .orElseThrow(AssertionError::new);

        int modulo = i % 10;
        return modulo;
    }

    private static Integer getNumber() {
        System.out.println("Podaj liczbę:");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        try {
            Integer integer = Integer.valueOf(line);
            if (integer > 9 || integer < 0) {
                throw new NumberFormatException();
            }
            return integer;
        } catch (NumberFormatException e) {
            return getNumber();
        }
    }
}
