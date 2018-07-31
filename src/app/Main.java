package app;

import data.*;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,6);
        Line2D line = new Line2D(2,3,4,5);
        Circle circle = new Circle(5);
        Cube cube = new Cube(6);
        Ball ball = new Ball(3);

        ShapeCalculator sc = new ShapeCalculator();
        System.out.println("Długość odcnika: "+LineCalc.lineLength(line));
        System.out.println("Pole prostokąta : "+sc.rectangleArea(rectangle));
        System.out.println("Pole koła : "+sc.circleArea(circle));
        System.out.println("Objętość sześcianu : "+sc.cubeVolume(cube));
        System.out.println("Objętość kuli : "+sc.ballVolume(ball));




    }
}
