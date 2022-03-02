package io.codelex.notes.day05;

public class Methods {
    public static void main(String[] args) {

        // Bare-bones function
        helloWorld();

        // Function with an argument
        myFirstMethod("myFirstArgument");

        // Function with return type and two arguments
        int sum = add(12, 49);
        System.out.println("Sum of two: " + sum);

        // Overloaded method add()
        int sum2 = add(9, 63, 23);
        System.out.println("Sum of three: " + sum2);

        // Function with multiple return instances
        int divided1 = divide(6, 3);
        System.out.println("Division: " + divided1);
        int divided2 = divide(777, 0); // Dividing by zero
        System.out.println("Division #2: " + divided2);

        // Recursion
        int factorialResult = factorial(6);
        System.out.println("Factorial: " + factorialResult);

    }

    // Basic Function
    private static void helloWorld() {
        System.out.println("Hello, World!");
    }

    // Function with Argument
    private static void myFirstMethod(String argument) {
        System.out.println("You called myFirstMethod() with argument value: " + argument);
    }

    // Function with Return
    private static int add(int a, int b) {
        return a + b;
    }

    // Function with multiple returns
    private static int divide(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a / b;
        }
    }

    // Method Overloading
    private static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Recursive Function
    private static int factorial(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
        // return number == 1 ? 1 : number * factorial(number - 1); // <== shorthand
    }


}
