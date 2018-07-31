package app;

import data.Line2D;

import static java.lang.Math.*;

public class LineCalc extends ShapeCalculator {

    public static double lineLength(Line2D line) {
        double length = sqrt(pow(line.getX1() - line.getX2(), 2) + pow(line.getY1() - line.getY2(), 2));
        return length;
    }
}
