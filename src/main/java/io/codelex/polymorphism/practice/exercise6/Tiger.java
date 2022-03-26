package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Feline {
    public Tiger(String animalName, double animalWeight, String livingRegion) {
        super(animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Growl");
    }

    @Override
    public void eatFood(Food food) {
        if (food instanceof Meat) {
            super.eatFood(food);
        } else {
            System.out.printf("%s refuses to eat %s.%n", getAnimalType(), food);
        }
    }

}
