package io.codelex.oop;

import io.codelex.oop.persons.Customer;
import io.codelex.oop.persons.Employee;

import java.time.LocalDate;

public class PersonsTest {
    public static void main(String[] args) {

        // Test Employee
        String firstName = "John";
        String lastName = "Brown";
        String id = "XXX";
        int age = 58;
        String position = "Accountant";
        LocalDate startedWorking = LocalDate.of(2000, 4, 1);

        Employee employee = new Employee(firstName, lastName, id, age, position, startedWorking);

        System.out.println("Employee:");
        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
        System.out.println(employee.getId());
        System.out.println(employee.getAge());
        System.out.println(employee.getWorkExperience());
        System.out.println(employee.getInfo());

        System.out.println();

        // Test Customer
        String firstName2 = "Peter";
        String lastName2 = "Brown";
        String id2 = "OOO";
        int age2 = 33;
        String customerId = "CID1234";
        int purchaseCount = 69;

        Customer customer = new Customer(firstName2, lastName2, id2, age2, customerId, purchaseCount);

        System.out.println("Customer:");
        System.out.println(customer.getFirstName());
        System.out.println(customer.getLastName());
        System.out.println(customer.getId());
        System.out.println(customer.getAge());
        System.out.println(customer.getPurchaseCount());
        customer.setPurchaseCount(420);
        System.out.println(customer.getPurchaseCount());
        System.out.println(customer.getInfo());

    }

}
