package io.codelex.oop.shapes2;

public class Cube extends Shape3D {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return side * 12;
    }

    @Override
    public double calculateArea() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    public double calculateVolume() {
        return Math.pow(side, 3);
    }

}
