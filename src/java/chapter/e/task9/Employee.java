package chapter.e.task9;

import chapter.e.task8.Person;

public class Employee extends Person {
    private String education;
    private String position;

    public Employee() {
        super();
        initialize();
    }

    @Override
    public void prettyPrint() {
        super.prettyPrint();
        System.out.println("education: " + education);
        System.out.println("position: " + position);
    }

    @Override
    protected void initialize() {
        education = getParam("Education");
        position = getParam("Position");
    }
}
