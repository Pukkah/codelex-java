package io.codelex.polymorphism.practice.exercise6;

public abstract class Mammal extends Animal {
    private String livingRegion;

    public Mammal(String animalName, double animalWeight, String livingRegion) {
        super(animalName, animalWeight);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    @Override
    public String toString() {
        return getAnimalType()
                + " ["
                + getAnimalName() + ", "
                + getFormattedAnimalWeight() + ", "
                + getLivingRegion() + ", "
                + getFoodEaten()
                + "]";
    }

}
