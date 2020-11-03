package chapter.e.task8;

import java.util.Scanner;

public class Person {
    private String name;
    private String surname;
    private String street;
    private String postcode;
    private String city;

    public Person() {
        initialize();
    }

    public void prettyPrint() {
        System.out.println("Dane:");
        System.out.println("==============");
        System.out.println("name: " + name);
        System.out.println("surname: " + surname);
        System.out.println("street: " + street);
        System.out.println("postcode: " + postcode);
        System.out.println("city: " + city);
    }

    protected void initialize() {
        name = getParam("Name");
        surname = getParam("Surname");
        street = getParam("Street");
        postcode = getParam("Postcode");
        city = getParam("City");
    }

    protected String getParam(String paramName) {
        System.out.printf("Podaj %s. %n", paramName);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
