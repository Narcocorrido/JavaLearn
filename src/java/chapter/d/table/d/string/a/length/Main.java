package chapter.d.table.d.string.a.length;

import chapter.d.table.d.string.LineReader;

public class Main {
    /**
     * Program, który umożliwia odczytywanie długości łańcucha zapamietanego w odpowiedniej zmiennej.
     * Skorzystaj z metody length(), a wynik wyświetl na ekranie monitora.
     */
    public static void main(String[] args) {
        System.out.println("Program mierzy długość łańcucha imię i nazwisko.");
        String name = LineReader.getLine("Podaj imię.");
        String surname = LineReader.getLine("Podaj nazwisko.");

        printLength("Imię", name);
        printLength("Nazwisko", surname);
    }

    private static void printLength(String label, String param) {
        System.out.printf("%s %s zawiera %d liter(y).\n", label, param, param.length());
    }
}
