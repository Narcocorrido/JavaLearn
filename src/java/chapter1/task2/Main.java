package chapter1.task2;

public class Main {
    /**
     * Program który wyświtla na ekranie komputera wartość predefiniowanej stałej pi = 3,14...
     * Należy przyjąć format wyświetlania tej stałej z dokładnością do pięciu miejsc po przecinku.
     */
    public static void main(String[] args) {
        System.out.println("Program wyświetla liczbę pi z zadaną dokładnością.");
        String pi = String.format("Pi = %.6g", Math.PI);
        System.out.println(pi);
        System.out.printf("Pi = %.6g%n", Math.PI);
        System.out.printf("Pi = %6.5f\n", Math.PI);
    }
}
//https://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html
//https://www.samouczekprogramisty.pl/formatter-formatowanie-lancuchow-znakow/
// 'f' 	floating point 	The result is formatted as a decimal number
// 'g', 'G' 	floating point 	The result is formatted using computerized scientific notation or decimal format, depending on the precision and the value after rounding.