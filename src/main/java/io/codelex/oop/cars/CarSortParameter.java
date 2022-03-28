package io.codelex.oop.cars;

import java.util.Comparator;

public enum CarSortParameter {
    NAME(Comparator.comparing(Car::getName)),
    MODEL(Comparator.comparing(Car::getModel)),
    PRICE(Comparator.comparing(Car::getPrice)),
    YEAR(Comparator.comparing(Car::getYearOfManufacture)),
    ENGINE(Comparator.comparing(Car::getEngineType));

    private final Comparator<Car> comparator;

    CarSortParameter(Comparator<Car> comparator) {
        this.comparator = comparator;
    }

    static Comparator<Car> by(CarSortParameter parameter, boolean ascending) {
        Comparator<Car> comparator = parameter.comparator;
        return ascending ? comparator : comparator.reversed();
    }

}
