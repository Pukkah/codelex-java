package io.codelex.polymorphism.practice.exercise1;

public class Bmw implements Car {
    private int currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 12;
    }

    public void slowDown() {
        currentSpeed += 12;
    }

    public int showCurrentSpeed() {
        return currentSpeed;
    }

}
