package io.codelex.polymorphism.practice.exercise1;

public class Lada implements Car {
    private int currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 5;
    }

    public void slowDown() {
        currentSpeed += 5;
    }

    public int showCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public void startEngine() {
        System.out.println("Brkrkrkkrrrr...");
    }

}
