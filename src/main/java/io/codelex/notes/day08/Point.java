package io.codelex.notes.day08;

import java.math.BigDecimal;

public class Point {
    private int x;
    private int y;

    public static void main(String[] args) {
        Point p1 = new Point(-2, -4);
        Point p2 = new Point(10, 5);

        BigDecimal distance = p1.distanceTo(p2);

        System.out.println(distance); //should print out 15
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public BigDecimal distanceTo(Point toPoint) {
        return BigDecimal.valueOf(Math.sqrt(Math.pow(toPoint.x - x, 2) + Math.pow(toPoint.y - y, 2)));
    }

}
