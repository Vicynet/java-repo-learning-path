package chapter10.abstracts.shape;

public class Cube extends ThreeDimensionalShape {
    private double sides;

    public Cube(double sides) {
        this.sides = sides;
    }

    public double getSides() {
        return sides;
    }

    public void setSides(double sides) {
        this.sides = sides;
    }

    @Override
    public double getArea() {
        return 6 * Math.pow(getSides(), 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(getSides(), 3);
    }

    @Override
    public String toString() {
        return String.format("Area of Cube: %.2f%nVolume of Cube: %.2f", getArea(), getVolume());
    }
}
