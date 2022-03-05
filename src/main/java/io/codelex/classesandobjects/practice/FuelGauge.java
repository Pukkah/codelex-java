package io.codelex.classesandobjects.practice;

public class FuelGauge {

    public static void main(String[] args) {
        // Class tests
        FuelGauge fuel = new FuelGauge(69);
        fuel.printFuel();
        fuel.addFuel();
        fuel.addFuel();
        fuel.printFuel();
        fuel.burnFuel();
        fuel.printFuel();
    }

    private static final int MAX_FUEL = 70;
    private int fuel;

    public FuelGauge() {
    }

    public FuelGauge(int fuel) {
        this.fuel = Math.min(fuel, MAX_FUEL);
    }

    public int getFuel() {
        return fuel;
    }

    public void printFuel() {
        System.out.printf("Fuel: %d/%d%n", fuel, MAX_FUEL);
    }

    public boolean hasFuel() {
        return fuel > 0;
    }

    public void addFuel() {
        if (fuel < MAX_FUEL) fuel++;
    }

    public void burnFuel() {
        if (fuel > 0) fuel--;
    }

}
