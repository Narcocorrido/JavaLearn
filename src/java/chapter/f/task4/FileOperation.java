package chapter.f.task4;

import java.io.IOException;
import java.io.RandomAccessFile;

public class FileOperation {

    private static final long LENGTH_OF_DOUBLE_IN_BYTE = 8;
    private static final String READ_WRITE = "rw";
    private static final String READ = "r";
    private static final double[] TABLE = {10.0, 10.1, 10.2, 10.3, 10.4, 10.5, 10.6, 10.7};
    private static final String FILE_NAME = "pomiary.txt";

    public FileOperation() throws IOException {
        saveToFile();
    }

    public void readEvenPositionNumbers() throws IOException {
        System.out.printf("Odczytywanie co drugiej liczby z pliku %s%n", FILE_NAME);
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(FILE_NAME, READ)) {
            for (int i = 0; i < TABLE.length; i += 2) {
                randomAccessFile.seek(i * LENGTH_OF_DOUBLE_IN_BYTE);
                double readValue = randomAccessFile.readDouble();
                System.out.println(readValue);
            }
        }
    }

    private void saveToFile() throws IOException {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(FILE_NAME, READ_WRITE)) {
            for (double number : TABLE) {
                randomAccessFile.writeDouble(number);
            }
        }
    }
}
