package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("SPEED CALCULATOR");

        System.out.print("Input distance in meters: ");
        int meters = in.nextInt();
        System.out.print("Input hours: ");
        int hours = in.nextInt();
        System.out.print("Input minutes: ");
        int minutes = in.nextInt();
        System.out.print("Input seconds: ");
        int seconds = in.nextInt();

        System.out.println("Output:");
        int timeInSeconds = (hours * 60 + minutes) * 60 + seconds;
        double metersPerSecond = (double) meters / timeInSeconds;
        double kmPerHour = metersPerSecond * 3.6;
        double milesPerHour = kmPerHour * 0.6214;
        System.out.println("Your speed in meters/second is " + metersPerSecond);
        System.out.println("Your speed in km/h is " + kmPerHour);
        System.out.println("Your speed in miles/h is " + milesPerHour);
    }
}
