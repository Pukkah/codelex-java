package io.codelex.oop;

import io.codelex.oop.shapes.Rectangle;
import io.codelex.oop.shapes.Triangle;

public class ShapesTest {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle(3, 4);
        System.out.println("Rectangle");
        System.out.println("Sides " + rect.getNumSides());
        System.out.println("Width " + rect.getWidth());
        System.out.println("Height " + rect.getHeight());
        System.out.println("Area " + rect.getArea());
        System.out.println("Perimeter " + rect.getPerimeter());

        System.out.println();

        Triangle tri = new Triangle(5, 6);
        System.out.println("Triangle");
        System.out.println("Sides " + tri.getNumSides());
        System.out.println("Width " + tri.getWidth());
        System.out.println("Height " + tri.getHeight());
        System.out.println("Area " + tri.getArea());
        System.out.println("Perimeter " + tri.getPerimeter());

    }

}
