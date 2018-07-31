package data;

import static java.lang.Math.pow;

public class Cube extends Shape3D {
    private double a;

    public Cube(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Sześcian o krawędzi "+getA();
    }

    @Override
    public double volume(Shape3D shape) {
        return pow(getA(), 3);
    }
}
