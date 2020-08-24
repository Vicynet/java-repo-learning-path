package com.techcrea8;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        System.out.println(rectangle);
        try {
            rectangle.setLength(23);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            rectangle.setWidth(23);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(rectangle);

        rectangle.setWidth(12);
        rectangle.setLength(15);

//        System.out.println(rectangle);

        System.out.printf("%s: %.2f", "Perimeter", rectangle.perimeter());
        System.out.println();
        System.out.printf("%s: %.2f", "Area", rectangle.area());



    }
}
