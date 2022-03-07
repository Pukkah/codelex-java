package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PrintDayInWord {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of weekday (0-6): ");
        int dayAsNumber = in.nextInt();

        String dayAsWord = switch (dayAsNumber) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Not a valid day";
        };

        System.out.println(dayAsNumber + " -> " + dayAsWord);

    }
}
