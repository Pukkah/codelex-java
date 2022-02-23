package io.codelex.arithmetic.practice;

import java.math.BigDecimal;

class Geometry {
    static double areaOfCircle(BigDecimal radius) {
        radius = fixIfNegative(radius);
        BigDecimal pi = new BigDecimal(Math.PI);
        BigDecimal area = pi.multiply(radius).multiply(new BigDecimal(2));
        return area.doubleValue();
    }

    static double areaOfRectangle(BigDecimal length, BigDecimal width) {
        length = fixIfNegative(length);
        width = fixIfNegative(width);
        return length.multiply(width).doubleValue();
    }

    static double areaOfTriangle(BigDecimal base, BigDecimal height) {
        base = fixIfNegative(base);
        height = fixIfNegative(height);
        return base.multiply(height).multiply(BigDecimal.valueOf(0.5)).doubleValue();
    }

    private static BigDecimal fixIfNegative(BigDecimal value) {
        if (value.signum() == -1) {
            System.out.println("Negative value detected!");
            System.out.println("Assuming it was a mistake..");
            return value.abs();
        }
        return value;
    }
}
