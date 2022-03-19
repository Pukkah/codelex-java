package io.codelex.oop.shapes2;

public class Hexagon extends Shape {
    public double radius;

    public Hexagon(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return radius * 6;
    }

    @Override
    public double calculateArea() {
        return (3 * Math.sqrt(3) * Math.pow(radius, 2)) / 2;
    }

}
