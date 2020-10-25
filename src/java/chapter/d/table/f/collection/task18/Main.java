package chapter.d.table.f.collection.task18;

import java.util.Arrays;
import java.util.List;

public class Main {
    /**
     * Korzystając z właściwości kolekcji ArrayList(), napisz program, który do kolekcji tego typu dodaje 6 różnych
     * imion, a następnie je sortuje.
     */
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Julia", "Agata", "Zenek", "Jarek", "Kasia", "Dominika");
        System.out.printf("Lista imion: %n%s%n%n", names);

        names.sort(String::compareTo);
        System.out.printf("Elementy posortowane:%n%s%n%n", names);
    }
}
