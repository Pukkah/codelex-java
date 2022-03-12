package io.codelex.classesandobjects.practice;

public class Odometer {
    private static final int MAX_ODO_VALUE = 1000000;
    private static final int KILOMETERS_PER_LITER = 10;
    private int kilometers;
    private int counter;
    private FuelGauge fuel;

    public Odometer(FuelGauge fuel, int kilometers) {
        this.kilometers = kilometers % MAX_ODO_VALUE;
        this.fuel = fuel;
    }

    public static void main(String[] args) {

        // create FuelGauge and fill it
        FuelGauge fuel = new FuelGauge(0);
        while (fuel.getFuel() < 5) {
            fuel.addFuel();
        }

        // create Odometer and drive till dry
        Odometer odo = new Odometer(fuel, 999990);
        while (fuel.hasFuel()) {
            odo.addKilometer();
            odo.printKilometers();
            fuel.printFuel();
        }

    }

    public void addKilometer() {
        // return if out of fuel
        if (!fuel.hasFuel()) {
            return;
        }
        // else continue
        if (++kilometers >= MAX_ODO_VALUE) {
            kilometers %= MAX_ODO_VALUE;
        }
        if (++counter == KILOMETERS_PER_LITER) {
            fuel.burnFuel();
            counter = 0;
        }

    }

    public void printKilometers() {
        System.out.printf("Driven %,d kilometers%n", kilometers);
    }

    public int getKilometers() {
        return kilometers;
    }

}
