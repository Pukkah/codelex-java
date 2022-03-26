package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {
    public static void main(String[] args) {
        List<Car> allCars = new ArrayList<>();
        allCars.add(new Audi());
        allCars.add(new Bmw());
        allCars.add(new Ferrari());
        allCars.add(new Lada());
        allCars.add(new Lexus());
        allCars.add(new Tesla());

        System.out.println("START YOUR ENGINES!!!");
        allCars.forEach(Car::startEngine);
        System.out.println("Three.. Two.. One.. GO!");
        for (int i = 0; i < 10; i++) {
            if (i != 2) {
                allCars.forEach(Car::speedUp);
            } else {
                allCars.forEach(car -> {
                    if (car instanceof NitrousOxideEngine) {
                        ((NitrousOxideEngine) car).useNitrousOxideEngine();
                    } else {
                        car.speedUp();
                    }
                });
            }
        }

        Car fastestCar = allCars.stream()
                                .max(Comparator.comparingInt(Car::showCurrentSpeed))
                                .get();
        System.out.println("Fastest car: " + fastestCar.getClass().getSimpleName());
        System.out.println("Speed reached: " + fastestCar.showCurrentSpeed());

    }

}
