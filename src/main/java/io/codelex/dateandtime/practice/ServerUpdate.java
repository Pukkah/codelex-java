package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ServerUpdate {
    public static void main(String[] args) {

        System.out.println("* - Date format 06-04-1988 (date-month-year)");
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyy");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Server launch date: ");
        LocalDate serverLaunched = LocalDate.parse(in.nextLine(), dateFormat);

        System.out.println("Check update schedule!");
        System.out.print("Year: ");
        int year = in.nextInt();
        in.nextLine();
        System.out.print("Month: ");
        int month = in.nextInt();
        LocalDate monthInQuestion = LocalDate.of(year, month, 1);

        LocalDate date = serverLaunched;
        while (date.isBefore(monthInQuestion.plusMonths(1))) {
            date = date.plusDays(14);
            if (date.getYear() == monthInQuestion.getYear() && date.getMonth() == monthInQuestion.getMonth()) {
                System.out.println(date);
            }
        }

    }

}