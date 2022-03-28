package io.codelex.dateandtime.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        final int workHoursInDay = 8;

        System.out.println("[Date format 06-04-1988 (date-month-year)]");
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyy");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Start date: ");
        LocalDate startDate = LocalDate.parse(in.nextLine(), dateFormat);
        System.out.print("Enter End date: ");
        LocalDate endDate = LocalDate.parse(in.nextLine(), dateFormat).plusDays(1);

        int hoursWorked = 0;
        for (LocalDate date = startDate; date.isBefore(endDate); date = date.plusDays(1)) {
            if (isWorkDay(date)) {
                hoursWorked += workHoursInDay;
            }
        }
        System.out.println("Spent " + hoursWorked + " hours working.");

    }

    private static boolean isWorkDay(LocalDate date) {
        return switch (date.getDayOfWeek()) {
            case SATURDAY, SUNDAY -> false;
            default -> true;
        };
    }

}
