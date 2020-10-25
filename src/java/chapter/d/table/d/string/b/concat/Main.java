package chapter.d.table.d.string.b.concat;

import chapter.d.table.d.string.LineReader;

public class Main {
    /**
     * Program, który składa dwa łańcuchy, a wynik tej operacji wyświetla na ekranie monitora.
     */
    public static void main(String[] args) {
        System.out.println("Program składa dwa łańcuchy.");
        String firstParam = LineReader.getLine("Podaj pierwszy łańcuch.");
        String secondParam = LineReader.getLine("Podaj drugi łańcuch.");

        String concatA = concat(firstParam, secondParam);
        String concatB = concat(secondParam, firstParam);

        if (concatA.equals(concatB)) {
            System.out.println("Składanie dwóch różnych łańcuchów jest przemienne.");
        } else {
            System.out.println("Składanie dwóch różnych łańcuchów nie jest przemienne.");
        }
    }

    private static String concat(String paramA, String paramB) {
        String concat = paramA.concat(paramB);
        System.out.printf("%s + %s = %s\n", paramA, paramB, concat);
        return concat;
    }
}
