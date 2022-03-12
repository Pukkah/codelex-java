package io.codelex.notes.day10.quiz;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Author {
    public static final int BOOKS_IN_THE_WORLD = 129864880;
    private final String firstName;
    private final String lastName;
    private final LocalDate dateOfBirth;
    private final List<String> books = new ArrayList<>();

    public Author(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public void addBook(String title) {
        books.add(title);
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    public boolean hasWrittenBook(String title) {
        return books.contains(title);
    }

    public void printAllInfo() {
        System.out.printf("Author %s%n", getFullName());
        System.out.printf("His age is %d at the moment%n", getAge());
        System.out.printf("He has written %d books", books.size());
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", books=" + books +
                '}';
    }
}
