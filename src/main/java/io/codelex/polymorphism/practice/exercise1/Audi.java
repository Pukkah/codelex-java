package io.codelex.polymorphism.practice.exercise1;

public class Audi implements Car {
    private int currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 10;
    }

    public void slowDown() {
        currentSpeed += 10;
    }

    public int showCurrentSpeed() {
        return currentSpeed;
    }

}
