package data;

public class Rectangle extends GeometricShape {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Prostokąt o długościach boków "+getA()+" i "+getB();
    }

   @Override
    public double area(GeometricShape shape) {
        return getA() * getB();
    }
}
