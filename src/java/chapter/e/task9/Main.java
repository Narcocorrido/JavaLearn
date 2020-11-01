package chapter.e.task9;

public class Main {

    /**
     * Program, w którym zawarty został proces dziedziczenia - klasa podrzędna Employee dziedziczy właściwości po
     * klasie bazowej Person oraz zawiera dwa dodatkowe pola wykształcenie i stanowisko oraz dwie dodatkowe metody:
     * inicjuj() i drukuj().
     */
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.prettyPrint();
    }
}
