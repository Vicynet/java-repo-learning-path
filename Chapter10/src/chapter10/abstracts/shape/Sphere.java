package chapter10.abstracts.shape;

public class Sphere extends ThreeDimensionalShape {
    private double radius;

    public Sphere(double radius) {
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
        return 4 * Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public double getVolume() {
        return (4 / 3) * Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public String toString() {
        return String.format("Area of Sphere: %.2f%nVolume of Sphere: %.2f", getArea(), getVolume());
    }
}
