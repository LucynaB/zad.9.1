package app;

import data.*;

import static java.lang.Math.*;


public class ShapeCalculator implements Calc2D, Calc3D {

//    public double circleArea(Circle circle) {
//        return Math.PI * pow(circle.getR(), 2);
//    }
//
//    public double rectangleArea(Rectangle rectangle) {
//        return rectangle.getA() * rectangle.getB();
//    }
//
//    public double ballVolume(Ball ball) {
//        return (4 * Math.PI * pow(ball.getR(), 3)) / 3;
//    }

//    public double cubeVolume(Cube cube) {
//        return pow(cube.getA(), 3);
//    }


    @Override
    public double shapeArea(GeometricShape shape) {

        return shape.area(shape);
    }

    @Override
    public double volume(Shape3D shape) {
        return shape.volume(shape);
    }
}
