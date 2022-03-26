package io.codelex.polymorphism.practice.exercise1;

public class Ferrari implements Car, NitrousOxideEngine {
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

    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 25;
    }

}
