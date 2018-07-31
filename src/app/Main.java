package app;

import data.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,6);
        Line2D line = new Line2D(2,3,4,5);
        Circle circle = new Circle(5);
        Cube cube = new Cube(6);
        Ball ball = new Ball(3);

        ShapeCalculator sc = new ShapeCalculator();
//        System.out.println("Długość odcnika: "+LineCalc.lineLength(line));
//        System.out.println("Pole prostokąta : "+sc.rectangleArea(rectangle));
//        System.out.println("Pole koła : "+sc.circleArea(circle));
//        System.out.println("Objętość sześcianu : "+sc.cubeVolume(cube));
//        System.out.println("Objętość kuli : "+sc.ballVolume(ball));

        Shape[] shapes = new Shape[5];
        shapes[0] = line;
        shapes[1] = rectangle;
        shapes[2] = circle;
        shapes[3] = cube;
        shapes[4] = ball;



        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Line2D) {
                //Line2D line = (Line2D) shapes[i];
                System.out.println(line + " ma długość: " + LineCalc.lineLength(line));
            }
            else if (shapes[i] instanceof GeometricShape) {
                GeometricShape shape =(GeometricShape)shapes[i];
                System.out.println(shape + " ma pole: " + sc.shapeArea(shape));

            }
            else if(shapes[i] instanceof Shape3D){
                Shape3D shape =(Shape3D)shapes[i];
                System.out.println(shape + " ma pojemność: " + sc.volume(shape));
            }
        }


    }
}
