package chapter.f.task4;

import java.io.IOException;

public class Main {
    /**
     * Program, który zamieszcza w pliku o dostępie swobodnym tablicę przeprowadzonych pomiarów, a następnie
     * wyświetla z pliku co drugi pomiar na ekranie monitora.
     */
    public static void main(String[] args) throws IOException {
        FileOperation fileOperation = new FileOperation();
        fileOperation.readEvenPositionNumbers();
    }
}
