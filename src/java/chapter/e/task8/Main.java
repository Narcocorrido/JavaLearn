package chapter.e.task8;

public class Main {
    /**
     * Program, w którym zdefiniowano klasę osoba, zawierającą następujące pola: nazwisko, imię, ulica, kod, miasto
     * oraz dwie metody: inicjuj() i drukuj(). Pierwsz z nich umożliwia wprowadzenie danych, natomiast druga
     * wyświtla je na ekranie komputera.
     */
    public static void main(String[] args) {
        Person person = new Person();
        person.prettyPrint();
    }
}
