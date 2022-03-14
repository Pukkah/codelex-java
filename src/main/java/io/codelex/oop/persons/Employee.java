package io.codelex.oop.persons;

import java.time.LocalDate;
import java.time.Period;

public class Employee extends Person {
    private String position;
    private LocalDate startedWorking;

    public Employee(String firstName, String lastName, String id, int age, String position, LocalDate startedWorking) {
        super(firstName, lastName, id, age);
        this.position = position;
        this.startedWorking = startedWorking;
    }

    public int getWorkExperience() {
        return Period.between(startedWorking, LocalDate.now())
                     .getYears();
    }

    @Override
    public String getInfo() {
        return position + " " + getFirstName() + " " + getLastName() + " (" + getWorkExperience() + ")";
    }

}
