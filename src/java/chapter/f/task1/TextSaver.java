package chapter.f.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextSaver {
    private static final String FILE_NAME = "data.txt";
    private final String text;

    public TextSaver() throws IOException {
        this.text = getParam("Imię i Nazwisko");
        saveParam();
    }

    public void readFile() throws IOException {
        System.out.printf("Odczytuje dane z pliku %s%n", FILE_NAME);
        FileReader fileReader = new FileReader(FILE_NAME);

        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                System.out.println(s);
            }
        }
    }

    private String getParam(String paramName) {
        System.out.printf("Podaj %s. %n", paramName);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private void saveParam() throws IOException {
        System.out.printf("Zapisuje dane do pliku %s%n", FILE_NAME);
        try (FileWriter fileWriter = new FileWriter(FILE_NAME)) {
            fileWriter.write(text);
        }
    }
}
