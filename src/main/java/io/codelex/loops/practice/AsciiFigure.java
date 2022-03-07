package io.codelex.loops.practice;

public class AsciiFigure {
    static final int SIZE = 5;

    public static void main(String[] args) {

        final String STARS = "********";
        final String LEFT = "////";
        final String RIGHT = "\\\\\\\\";

        for (int i = 1; i <= SIZE; i++) {
            System.out.println(LEFT.repeat(SIZE - i) + STARS.repeat(i - 1) + RIGHT.repeat(SIZE - i));
        }

    }

}
