package chapter.c.task.a.task1;

public class Main {
    /**
     * Program, który za pomocą instrukcji for dla danych wartości x zmieniających się od 0 do 10
     * oblicza wartość funkcji y = 3x.
     */
    public static void main(String[] args) {
        String message = "Program oblicza wartośc funkcji y = 3*x dla x zmieniającego się od 0 do 10";
        System.out.println(message);
        for (int i = 0; i <= 10; i++) {
            System.out.printf("x=%d \t y=%d %n", i, i * 3);
        }
    }
}
