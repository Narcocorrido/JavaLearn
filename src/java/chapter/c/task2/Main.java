package chapter.c.task2;

public class Main {
    /**
     * Program, który za pomocą instrukcji do ... while dla danych wartości x zmieniających się od 0 do 10
     * oblicza wartość funkcji y = 3x.
     */
    public static void main(String[] args) {
        String message = "Program oblicza wartośc funkcji y = 3*x dla x zmieniającego się od 0 do 10";
        System.out.println(message);
        int i = 0;
        do {
            System.out.printf("x=%d \t y=%d %n", i, i * 3);
            i++;
        } while (i <= 10);
    }
}
