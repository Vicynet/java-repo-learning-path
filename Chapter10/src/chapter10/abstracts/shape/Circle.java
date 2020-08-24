package chapter10.abstracts.shape;
import java.lang.Math.*;

public class Circle extends TwoDimensionalShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    public String toString() {
        return String.format("Area of Circle: %.2f", getArea());
    }
}
