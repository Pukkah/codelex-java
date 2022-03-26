package io.codelex.polymorphism.practice.exercise6;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AnimalsMain {
    private static final Map<String, Constructor> animalConstructors = Map.of(
            "Mouse", Mouse.class.getConstructors()[0],
            "Zebra", Zebra.class.getConstructors()[0],
            "Cat", Cat.class.getConstructors()[0],
            "Tiger", Tiger.class.getConstructors()[0]
    );
    private static final Map<String, Constructor> foodConstructors = Map.of(
            "Vegetable", Vegetable.class.getConstructors()[0],
            "Meat", Meat.class.getConstructors()[0]
    );

    public static void main(String[] args) {
        System.out.println("# Animal: {AnimalType} {AnimalName} {AnimalWeight} {AnimalLivingRegion} [{CatBreed} = Only if its cat]");
        System.out.println("# AnimalType: " + String.join(", ", animalConstructors.keySet()));
        System.out.println("# Food: {FoodType} {quantity}");
        System.out.println("# FoodType: " + String.join(", ", foodConstructors.keySet()));
        System.out.println("# Enter 'End' at 'Animal' stage to quit!");
        List<Animal> animals = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Animal: ");
            String[] animalInput = in.nextLine().split(" ");
            if (animalInput[0].equals("End")) {
                break;
            }
            String animalClass = animalInput[0];
            if (!animalConstructors.containsKey(animalClass)) {
                continue;
            }
            Animal animal;
            try {
                Object[] initargs;
                if (animalInput.length == 4) {
                    initargs = new Object[]{ animalInput[1], Double.valueOf(animalInput[2]), animalInput[3] };
                } else if (animalInput.length == 5 && animalClass.equals("Cat")) {
                    initargs = new Object[]{ animalInput[1], Double.valueOf(animalInput[2]), animalInput[3], animalInput[4] };
                } else {
                    continue;
                }
                animal = (Animal) animalConstructors.get(animalClass)
                                                    .newInstance(initargs);
                animal.makeSound();
            } catch (Exception ignored) {
                continue;
            }

            while (true) {
                System.out.print("Food: ");
                String[] foodInput = in.nextLine().split(" ");
                String foodClass = foodInput[0];
                if (!foodConstructors.containsKey(foodClass) || foodInput.length != 2) {
                    continue;
                }
                try {
                    Integer foodQuantity = Integer.valueOf(foodInput[1]);
                    Food food = (Food) foodConstructors.get(foodClass)
                                                       .newInstance(foodQuantity);
                    animal.eatFood(food);
                    System.out.println(animal);
                    animals.add(animal);
                    break;
                } catch (Exception ignored) {
                }
            }
        }
        animals.forEach(System.out::println);
    }

}
