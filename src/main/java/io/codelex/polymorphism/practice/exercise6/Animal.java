package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public abstract class Animal {
    private String animalType;
    private String animalName;
    private double animalWeight;
    private int foodEaten;

    public Animal(String animalName, double animalWeight) {
        this.animalType = this.getClass().getSimpleName();
        this.animalName = animalName;
        this.animalWeight = animalWeight;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getAnimalName() {
        return animalName;
    }

    public double getAnimalWeight() {
        return animalWeight;
    }

    public String getFormattedAnimalWeight() {
        DecimalFormat formatter = new DecimalFormat("0.##");
        return formatter.format(getAnimalWeight());
    }

    public int getFoodEaten() {
        return foodEaten;
    }

    public abstract void makeSound();

    public void eatFood(Food food) {
        foodEaten += food.eatAll();
    }

    @Override
    public String toString() {
        return getAnimalType()
                + " ["
                + getAnimalName() + ", "
                + getFormattedAnimalWeight() + ", "
                + getFoodEaten()
                + "]";
    }

}
