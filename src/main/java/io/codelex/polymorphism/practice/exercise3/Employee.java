package io.codelex.polymorphism.practice.exercise3;

public class Employee extends Person {
    private String jobTitle;

    public Employee(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Employee(String firstName, String lastName, String address, int id, String jobTitle) {
        super(firstName, lastName, address, id);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Job Title: " + jobTitle);
    }

}
