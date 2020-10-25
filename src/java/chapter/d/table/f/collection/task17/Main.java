package chapter.d.table.f.collection.task17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    /**
     * Korzystając z właściwości kolekcji ArrayList(), napisz program, który do kolekcji tego typu dodaje 6
     * różnych liczb, a następnie je sortuje. Po wykonaniu tej operacji należy usunąc drugi element z list, dodać nowy
     * element do listy i wykonać ponowne sortowanie.
     */
    public static void main(String[] args) {
        List<Integer> ints = new Random().ints(6, 0, 100)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.printf("Wygenerowana lista: %n%s%n%n", ints);

        ints.sort(Integer::compareTo);
        System.out.printf("Elementy posortowane:%n%s%n%n", ints);

        Integer removed = ints.remove(1);
        int newRandom = new Random().nextInt(100);
        ints.add(newRandom);
        System.out.printf("Usunięto drugi element z listy: %d i dodano nowy element: %d %n", removed, newRandom);
        System.out.printf("Elementy nieposortowane po usunięciu z listy i dodaniu nowego elementu:%n%s%n%n", ints);

        Collections.sort(ints);
        System.out.printf("Lista po ponownym posortowaniu:%n%s%n%n", ints);
    }
}
