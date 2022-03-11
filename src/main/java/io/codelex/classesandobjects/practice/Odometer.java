package io.codelex.classesandobjects.practice;

public class Odometer {
    private int kilometers;
    private int counter;
    private FuelGauge fuel;

    public Odometer(FuelGauge fuel, int kilometers) {
        this(fuel);
        this.kilometers = kilometers % 1000000;
    }

    public Odometer(FuelGauge fuel) {
        this.fuel = fuel;
    }

    public static void main(String[] args) {

        // create FuelGauge and fill it
        FuelGauge fuel = new FuelGauge();
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
        if (!fuel.hasFuel()) { return; }
        // else continue
        if (++kilometers > 999999) {
            kilometers %= 1000000;
        }
        if (++counter == 10) {
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
