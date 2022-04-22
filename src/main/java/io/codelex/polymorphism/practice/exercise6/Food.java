package io.codelex.polymorphism.practice.exercise6;

public abstract class Food {
    private int quantity;

    public Food(int quantity) {
        this.quantity = quantity;
    }

    public int eatAll() {
        int foodEaten = quantity;
        quantity = 0;
        return foodEaten;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

}
