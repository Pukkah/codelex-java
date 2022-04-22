package io.codelex.polymorphism.practice.exercise6;

public class Zebra extends Mammal {
    public Zebra(String animalName, double animalWeight, String livingRegion) {
        super(animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Neigh");
    }

    @Override
    public void eatFood(Food food) {
        if (food instanceof Vegetable) {
            super.eatFood(food);
        } else {
            System.out.printf("%s refuses to eat %s.%n", getAnimalType(), food);
        }
    }

}
