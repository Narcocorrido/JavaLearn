package chapter1.task4;

public class Sphere {

    private final double r;

    public Sphere(double r) {
        this.r = r;
    }

    public double getVolume() {
        return (4 * Math.PI * Math.pow(r, 3)) / 3;
    }
}
