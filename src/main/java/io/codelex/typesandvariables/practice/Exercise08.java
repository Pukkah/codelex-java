package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {

        final int MINUTES_IN_DAY = 60 * 24;
        final int MINUTES_IN_YEAR = MINUTES_IN_DAY * 365;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter minutes to convert into years and days");
        long minutes = in.nextLong();
        long years = minutes / MINUTES_IN_YEAR;
        long days = minutes % MINUTES_IN_YEAR / MINUTES_IN_DAY;
        long minutesRemainder = minutes % MINUTES_IN_YEAR % MINUTES_IN_DAY;

        System.out.printf("That is %d years and %d days with %d minutes left over.", years, days, minutesRemainder);

    }
}
