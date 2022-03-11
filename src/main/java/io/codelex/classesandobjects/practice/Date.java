package io.codelex.classesandobjects.practice;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public static void main(String[] args) {

        Date testDate = new Date(2022, 3, 4);
        testDate.displayDate();
        testDate.setYear(1988);
        testDate.setMonth(4);
        testDate.setDay(6);
        System.out.println("Year: " + testDate.getYear());
        System.out.println("Month: " + testDate.getMonth());
        System.out.println("Day: " + testDate.getDay());

    }

    public void displayDate() {
        System.out.printf("%02d.%02d.%d%n", day, month, year);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

}
