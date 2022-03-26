package io.codelex.polymorphism.practice.exercise3;

public class Exercise3Main {
    public static void main(String[] args) {
        Person person = new Person("Adam", "Green", "[redacted]", 3);
        Student student = new Student("John", "Smith", "42nd Street, NY", 420, 6.9);
        Employee employee = new Employee("Thomas", "Anderson", "Room 101", 1, "Neo");

        person.display();
        student.display();
        employee.display();

    }

}
