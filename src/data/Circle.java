package data;

import static java.lang.Math.pow;

public class Circle extends GeometricShape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Koło o promieniu "+getR();
    }

    @Override
    public double area(GeometricShape shape) {
        return Math.PI * pow(getR(), 2);
    }
}
