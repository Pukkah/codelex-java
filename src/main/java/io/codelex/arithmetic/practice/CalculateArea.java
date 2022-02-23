package io.codelex.arithmetic.practice;

import java.math.BigDecimal;
import java.util.Scanner;

public class CalculateArea {
    public static void main(String[] args) {
        int choice; // The user's menu choice

        do {
            // Get the user's menu choice.
            choice = getMenu();

            switch (choice) {
                case 1 -> calculateCircleArea();
                case 2 -> calculateRectangleArea();
                case 3 -> calculateTriangleArea();
                case 4 -> System.out.println("Thanks for calculating!");
            }
            System.out.println();

        } while (choice != 4);
    }

    public static int getMenu() {

        int userChoice;

        // keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Display the menu.
        System.out.println("Geometry Calculator\n");
        System.out.println("1. Calculate the Area of a Circle");
        System.out.println("2. Calculate the Area of a Rectangle");
        System.out.println("3. Calculate the Area of a Triangle");
        System.out.println("4. Quit\n");
        System.out.print("Enter your choice (1-4) : ");

        // get input from user
        userChoice = keyboard.nextInt();

        // validate input
        while (userChoice < 1 || userChoice > 4) {
            System.out.print("Please enter a valid range: 1, 2, 3, or 4: ");
            userChoice = keyboard.nextInt();
        }

        return userChoice;
    }

    public static void calculateCircleArea() {

        BigDecimal radius;

        // Get input from user
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is the circle's radius? ");
        radius = BigDecimal.valueOf(keyboard.nextDouble());

        // Display output
        System.out.println("The circle's area is "
                + Geometry.areaOfCircle(radius));
    }

    public static void calculateRectangleArea() {
        BigDecimal length;
        BigDecimal width;

        // Get input from user
        Scanner keyboard = new Scanner(System.in);

        // Get length
        System.out.print("Enter length? ");
        length = BigDecimal.valueOf(keyboard.nextDouble());

        // Get width
        System.out.print("Enter width? ");
        width = BigDecimal.valueOf(keyboard.nextDouble());

        // Display output
        System.out.println("The rectangle's area is "
                + Geometry.areaOfRectangle(length, width));
    }

    public static void calculateTriangleArea() {
        BigDecimal base;
        BigDecimal height;

        // Get input from user
        Scanner keyboard = new Scanner(System.in);

        // Get the base
        System.out.print("Enter length of the triangle's base? ");
        base = BigDecimal.valueOf(keyboard.nextDouble());

        // Get the height
        System.out.print("Enter triangle's height? ");
        height = BigDecimal.valueOf(keyboard.nextDouble());

        // Display the triangle's area.
        System.out.println("The triangle's area is "
                + Geometry.areaOfTriangle(base, height));
    }
}
