package io.codelex.polymorphism.practice.exercise1;

public class Lexus implements Car, NitrousOxideEngine {
    private int currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 8;
    }

    public void slowDown() {
        currentSpeed += 8;
    }

    public int showCurrentSpeed() {
        return currentSpeed;
    }

    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 30;
    }

}
