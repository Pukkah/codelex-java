package io.codelex.polymorphism.practice.exercise1;

public class Audi implements Car {
    private int currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 10;
    }

    @Override
    public void slowDown() {
        currentSpeed += 10;
    }

    @Override
    public int showCurrentSpeed() {
        return currentSpeed;
    }

}
