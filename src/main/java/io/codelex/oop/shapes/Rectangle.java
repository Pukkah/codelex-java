package io.codelex.oop.shapes;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        super(4);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }

}
