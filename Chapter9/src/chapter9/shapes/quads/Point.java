package chapter9.shapes.quads;

public class Point {
    private final int point = 4;

    public Point() {
    }

    public int getPoint() {
        return point;
    }

    public String toString() {
        return String.format("%d", getPoint());
    }
}
