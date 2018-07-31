package data;

import static java.lang.Math.pow;

public class Ball extends Shape3D {
    private double r;

    public Ball(double r) {
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
        return "Kula o promieniu "+getR();
    }

    @Override
    public double volume(Shape3D shape) {
        return (4 * Math.PI * pow(getR(), 3)) / 3;
    }
}
