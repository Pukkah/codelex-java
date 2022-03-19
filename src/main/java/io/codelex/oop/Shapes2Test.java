package io.codelex.oop;

import io.codelex.oop.shapes2.*;

public class Shapes2Test {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(2, 3);
        System.out.println(rectangle.calculatePerimeter());
        System.out.println(rectangle.calculateArea());

        Shape triangle = new Triangle(2, 3, 4);
        System.out.println(triangle.calculatePerimeter());
        System.out.println(triangle.calculateArea());

        Shape hexagon = new Hexagon(3);
        System.out.println(hexagon.calculatePerimeter());
        System.out.println(hexagon.calculateArea());

        Shape3D cone = new Cone(12, 4);
        System.out.println(cone.calculatePerimeter());
        System.out.println(cone.calculateArea());
        System.out.println(cone.calculateVolume());

        Shape3D cube = new Cube(3);
        System.out.println(cube.calculatePerimeter());
        System.out.println(cube.calculateArea());
        System.out.println(cube.calculateVolume());

    }

}
