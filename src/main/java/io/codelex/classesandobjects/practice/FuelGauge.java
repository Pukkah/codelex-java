package io.codelex.classesandobjects.practice;

public class FuelGauge {
    private static final int MAX_FUEL = 70;
    private int fuel;

    public FuelGauge(int fuel) {
        this.fuel = Math.min(fuel, MAX_FUEL);
    }

    public static void main(String[] args) {
        FuelGauge fuel = new FuelGauge(69);
        fuel.printFuel();
        fuel.addFuel();
        fuel.addFuel();
        fuel.printFuel();
        fuel.burnFuel();
        fuel.printFuel();
    }

    public void printFuel() {
        System.out.printf("Fuel: %d/%d%n", fuel, MAX_FUEL);
    }

    public void addFuel() {
        if (fuel < MAX_FUEL) {
            fuel++;
        }
    }

    public void burnFuel() {
        if (fuel > 0) {
            fuel--;
        }
    }

    public int getFuel() {
        return fuel;
    }

    public boolean hasFuel() {
        return fuel > 0;
    }

}
