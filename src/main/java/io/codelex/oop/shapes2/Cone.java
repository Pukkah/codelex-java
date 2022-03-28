package io.codelex.oop.shapes2;

public class Cone extends Shape3D {
    private double height;
    private double radius;

    public Cone(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        // Perimeter of base, I don't know any other perimeters for Cones!
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
    }

    @Override
    public double calculateVolume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }

}
