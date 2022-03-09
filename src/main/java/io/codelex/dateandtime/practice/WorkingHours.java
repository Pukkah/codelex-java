package io.codelex.dateandtime.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        System.out.println("* - Date format 06-04-1988 (date-month-year)");
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyy");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Start date: ");
        LocalDate startDate = LocalDate.parse(in.nextLine(), dateFormat);
        System.out.print("Enter End date: ");
        LocalDate endDate = LocalDate.parse(in.nextLine(), dateFormat).plusDays(1);

        Period employed = Period.between(startDate, endDate);
        if (employed.isNegative()) {
            System.out.println("Is this some \"Back to the Future\" stuff?");
        } else {
            int daysWorked = employed.getDays();
            if (daysWorked < 7) {
                for (LocalDate date = startDate; date.isBefore(endDate); date = date.plusDays(1)) {
                    if (date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                        daysWorked--;
                    }
                }
            }
            int weeksWorked = daysWorked / 7;
            int remainingDays = daysWorked % 7;
            if (remainingDays > 5) { remainingDays = 5; }
            int hoursWorked = (weeksWorked * 5 + remainingDays) * 8;

            System.out.println("Spent " + hoursWorked + " hours working.");
        }

    }
}
