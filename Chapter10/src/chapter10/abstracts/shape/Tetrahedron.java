package chapter10.abstracts.shape;

public class Tetrahedron extends ThreeDimensionalShape {
    private double base;
    private double height;

    public Tetrahedron(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2 * getBase() * getHeight();
    }

    @Override
    public double getVolume() {
        return (Math.sqrt(2) / 12) * Math.pow(getBase(), 3);
    }

    @Override
    public String toString() {
        return String.format("Area of Tetrahedron: %.2f%nVolume of Tetrahedron: %.2f", getArea(), getVolume());
    }
}
