package com.techcrea8;

public class Rectangle {
//    (Rectangle Class) Create a class Rectangle with attributes length and width, each of which
//            defaults to 1. Provide methods that calculate the rectangle’s perimeter and area. It has set and get
//    methods for both length and width. The set methods should verify that length and width are each
//    floating-point numbers larger than 0.0 and less than 20.0. Write a program to test class Rectangle.
    private double length;
    private double width;

    public Rectangle() {
        this(1,1);
    }

    public Rectangle(double length, double width) {
        if (length < 0.0 || length > 20.0) {
            throw new IllegalArgumentException(length + ": Length Must be between 0.0 and 20.0");
        }
        if (width < 0.0 || width > 20.0) {
            throw new IllegalArgumentException(width + ": Width Must be between 0.0 and 20.0");
        }
        this.length = length;
        this.width = length;
    }

    public double perimeter () {
        return 2 * getLength() + 2 * getWidth();
    }

    public double area () {
        return getLength() * getWidth();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0.0 || length > 20.0) {
            throw new IllegalArgumentException(length + ": Length Must be between 0.0 and 20.0");
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0.0 || width > 20.0) {
            throw new IllegalArgumentException(width + ": Width Must be between 0.0 and 20.0");
        }
        this.width = width;
    }

    public String toString() {
        return String.format("%s: %.2f%n%s: %.2f", "Width", getWidth(), "Length", getLength());
    }
}
