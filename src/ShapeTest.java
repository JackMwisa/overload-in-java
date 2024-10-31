package src;

// ShapeTest.java
public class ShapeTest {
    public static void main(String[] args) {
        // Using different constructors to create Shape objects
        Shape undefinedShape = new Shape();
        Shape circle = new Shape(5.0);
        Shape square = new Shape(4, 4.0);
        Shape rectangle = new Shape(4, 5.0, 7.0);
        Shape triangle = new Shape(3, 3.0, 4.0, 5.0);

        // Get shape details
        String undefinedDetails = undefinedShape.getShapeDetails();
        String circleDetails = circle.getShapeDetails();
        String squareDetails = square.getShapeDetails();
        String rectangleDetails = rectangle.getShapeDetails();
        String triangleDetails = triangle.getShapeDetails();

        // Print shape details
        System.out.println(undefinedDetails);
        System.out.println(circleDetails);
        System.out.println(squareDetails);
        System.out.println(rectangleDetails);
        System.out.println(triangleDetails);
    }
}

