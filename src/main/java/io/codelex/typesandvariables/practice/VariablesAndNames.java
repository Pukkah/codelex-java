package io.codelex.typesandvariables.practice;

public class VariablesAndNames {
    public static void main(String[] args) {
        int cars;
        int drivers;
        int passengers;
        int carsNotDriven;
        int carsDriven;
        int seatsInACar;
        int carpoolCapacity;
        double averagePassengersPerCar;

        cars = 100;
        seatsInACar = 4;
        drivers = 30;
        passengers = 90;
        carsNotDriven = cars - drivers;
        carsDriven = drivers;
        carpoolCapacity = carsDriven * seatsInACar;
        averagePassengersPerCar = passengers / carsDriven;

        System.out.printf("There are %d cars available.%n", cars);
        System.out.printf("There are only %d drivers available.%n", drivers);
        System.out.printf("There will be %d empty cars today.%n", carsNotDriven);
        System.out.printf("We can transport %d people today.%n", carpoolCapacity);
        System.out.printf("We have %d to carpool today.%n", passengers);
        System.out.printf("We need to put about %.2f in each car.%n", averagePassengersPerCar);
    }
}