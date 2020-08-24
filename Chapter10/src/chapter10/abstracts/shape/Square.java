package chapter10.abstracts.shape;

public class Square extends TwoDimensionalShape {
    private double sides;

    public Square(int sides) {
        this.sides = sides;
    }

    public double getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    @Override
    public double getArea() {
        return Math.pow(getSides(), 2);
    }

    @Override
    public String toString() {
        return String.format("Area of Square: %.2f", getArea());
    }
}
