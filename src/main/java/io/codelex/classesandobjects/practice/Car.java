package io.codelex.classesandobjects.practice;

public class Car {
    private double startKilometers; // Starting odometer reading
    private double endKilometers; // Ending odometer reading
    private double liters; // Liters of gas used between the readings

    public Car(double startKilometers, double endKilometers, double liters) {
        this(startKilometers);
        this.endKilometers = endKilometers;
        this.liters = liters;
    }

    public Car(double startKilometers) {
        this.startKilometers = startKilometers;
    }

    public static void main(String[] args) {

        Car myCar = new Car(100.0, 200.0, 4.0);
        System.out.println("First Car:");
        System.out.println("Liters per 100km - " + myCar.calculateConsumption());
        System.out.println("Has Hog: " + myCar.gasHog());
        System.out.println("Economy Car: " + myCar.economyCar());

        System.out.println();

        System.out.println("Second Car:");
        Car myOtherCar = new Car(1000.0);
        myOtherCar.fillUp(1200.0, 36.0);
        System.out.println("Liters per 100km - " + myOtherCar.calculateConsumption());
        System.out.println("Has Hog: " + myOtherCar.gasHog());
        System.out.println("Economy Car: " + myOtherCar.economyCar());
        myOtherCar.fillUp(2000.0, 150);
        System.out.println("Liters per 100km - " + myOtherCar.calculateConsumption());

    }

    public double calculateConsumption() {
        return liters / (endKilometers - startKilometers) * 100;
    }

    public boolean gasHog() {
        return calculateConsumption() > 15.0;
    }

    public boolean economyCar() {
        return calculateConsumption() < 5.0;
    }

    public void fillUp(double endKilometers, double liters) {
        this.endKilometers = endKilometers;
        this.liters += liters;
    }

}
