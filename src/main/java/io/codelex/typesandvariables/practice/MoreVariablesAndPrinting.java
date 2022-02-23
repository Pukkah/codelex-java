package io.codelex.typesandvariables.practice;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {

        String name = "Zed A. Shaw";
        String eyes = "Blue";
        String teeth = "White";
        String hair = "Brown";

        int age = 35;
        int height = 74;  // inches
        int weight = 180; // lbs

        double heightInCm = height * 2.54;
        double weightInKg = weight * 0.453592;

        System.out.println("Let's talk about " + name + ".");
        System.out.printf("He's %.2f centimeters tall.%n", heightInCm);
        System.out.printf("He's %.2f kilos heavy.%n", weightInKg);
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");

        System.out.printf("If I add %d, %.2f, and %.2f I get %.2f.%n", age, heightInCm, weightInKg, age + heightInCm + weightInKg);
    }
}