package io.codelex.classesandobjects.practice;

public class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {

        Point p1 = new Point(5, 2);
        Point p2 = new Point(-3, 6);
        swapPoints(p1, p2);
        System.out.println("(" + p1.x + ", " + p1.y + ")");
        System.out.println("(" + p2.x + ", " + p2.y + ")");

    }

    public static void swapPoints(Point a, Point b) {
        int ax = a.x;
        int ay = a.y;
        a.updatePoint(b.x, b.y);
        b.updatePoint(ax, ay);
    }

    public void updatePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

}