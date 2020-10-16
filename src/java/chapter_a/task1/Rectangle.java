package chapter_a.task1;

public class Rectangle {
    Double a, b;

    public Rectangle(Double a, Double b) {
        this.a = a;
        this.b = b;
    }

    public Double getA() {
        return a;
    }

    public Double getB() {
        return b;
    }

    public Double getArea() {
        return a * b;
    }
}
