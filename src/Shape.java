package src;

// Shape.java
public class Shape {
    private String shapeName;
    private int numberOfEdges;

    // No-parameter constructor
    public Shape() {
        System.out.println("Shape object created.");
        this.shapeName = "Undefined shape";
    }

    // Constructor for circle
    public Shape(double radius) {
        System.out.println("Circle object created.");
        this.shapeName = "Circle";
        this.numberOfEdges = 0;
    }

    // Constructor for square
    public Shape(int edges, double edgeLength) {
        System.out.println("Square object created.");
        this.shapeName = "Square";
        this.numberOfEdges = edges;
    }

    // Constructor for rectangle
    public Shape(int edges, double e1, double e2) {
        System.out.println("Rectangle object created.");
        this.shapeName = "Rectangle";
        this.numberOfEdges = edges;
    }

    // Constructor for triangle
    public Shape(int edges, double e1, double e2, double e3) {
        System.out.println("Triangle object created.");
        this.shapeName = "Triangle";
        this.numberOfEdges = edges;
    }

    // Method to return shape details
    public String getShapeDetails() {
        return "Shape: " + shapeName + ", Number of Edges: " + numberOfEdges;
    }
}

