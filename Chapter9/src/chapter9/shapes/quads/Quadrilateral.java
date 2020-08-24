package chapter9.shapes.quads;

public class Quadrilateral {
    private final double length;
    private final double width;
    private final Point point;

    public Quadrilateral(double length, double width, Point point) {
        this.length = length;
        this.width = width;
        this.point = point;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * length * width;
    }

    @Override
    public String toString() {
        return String.format("%s: %d%n%s: %.2f%n%s: %.2f", "Sides",
                point, "Length", getLength(), "Width", getWidth());
    }
}
