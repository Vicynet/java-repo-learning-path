package chapter10.abstracts.shape;

public abstract class ThreeDimensionalShape extends TwoDimensionalShape implements Shape {
    @Override
    public abstract double getArea();

    public abstract double getVolume();
}
