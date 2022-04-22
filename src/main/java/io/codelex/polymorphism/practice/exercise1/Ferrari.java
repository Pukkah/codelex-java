package io.codelex.polymorphism.practice.exercise1;

public class Ferrari implements Car, NitrousOxideEngine {
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

    @Override
    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 25;
    }

}
