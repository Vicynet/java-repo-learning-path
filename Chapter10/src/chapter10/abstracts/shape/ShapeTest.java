package chapter10.abstracts.shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapeObjects = new Shape[6];

        shapeObjects[0] = new Triangle(12, 19);
        shapeObjects[1] = new Circle(14);
        shapeObjects[2] = new Square(10);
        shapeObjects[3] = new Cube(15);
        shapeObjects[4] = new Sphere(17);
        shapeObjects[5] = new Tetrahedron(3, 5);

        for (Shape allShapes : shapeObjects) {
            System.out.printf("Shape is a %s and belongs to family of %s%n", allShapes.getClass().getSimpleName(), allShapes.getClass().getSuperclass().getSimpleName());
            if ("TwoDimensionalShape".equals(allShapes.getClass().getSuperclass().getSimpleName())) {
                TwoDimensionalShape twoD = (TwoDimensionalShape) allShapes;
                System.out.println(twoD.toString());
            }
            else {
                if (allShapes.getClass().getSuperclass().getSimpleName().equals("ThreeDimensionalShape")) {
                    ThreeDimensionalShape threeD = (ThreeDimensionalShape) allShapes;
                    System.out.println(threeD.toString());
                }
            }
        }
    }
}
