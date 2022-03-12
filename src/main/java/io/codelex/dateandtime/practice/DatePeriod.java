package io.codelex.dateandtime.practice;

import java.time.LocalDate;

public class DatePeriod {
    private final LocalDate start;
    private final LocalDate end;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public static void main(String[] args) {

        LocalDate firstStart = LocalDate.of(2022, 1, 1);
        LocalDate firstEnd = LocalDate.of(2022, 1, 15);
        DatePeriod firstPeriod = new DatePeriod(firstStart, firstEnd);

        LocalDate secondStart = LocalDate.of(2022, 1, 10);
        LocalDate secondEnd = LocalDate.of(2022, 1, 25);
        DatePeriod secondPeriod = new DatePeriod(secondStart, secondEnd);

        DatePeriod overlap = firstPeriod.intersection(secondPeriod);

        //overlap variable should have start date 10.01.2022 and end date 15.01.2022
        System.out.println(overlap.start + " - " + overlap.end);

    }

    public DatePeriod intersection(DatePeriod other) {
        LocalDate intersectionStart = null;
        LocalDate intersectionEnd = null;
        if (start.isAfter(other.start) && start.isBefore(other.end)) {
            intersectionStart = start;
        } else if (other.start.isAfter(start) && other.start.isBefore(end)) {
            intersectionStart = other.start;
        }
        if (end.isBefore(other.end) && end.isAfter(other.start)) {
            intersectionEnd = end;
        } else if (other.end.isBefore(end) && other.end.isAfter(start)) {
            intersectionEnd = other.end;
        }
        if (intersectionStart != null && intersectionEnd != null) {
            return new DatePeriod(intersectionStart, intersectionEnd);
        } else {
            return null;
        }
    }

}
