package chapter.f.file.task1;

import java.io.IOException;

public class Main {
    /**
     * Zgodnie z zasadami programowania obiektowego. Program, który wczytuje z klawiatury imię i nazwisko, zapisuje te
     * dane do pliku tekstowego dane.txt, a następnie odczytuje je z tego pliku i wyświetla na ekranie komputera.
     */
    public static void main(String[] args) throws IOException {
        TextSaver textSaver = new TextSaver();
        textSaver.readFile();
    }
}
