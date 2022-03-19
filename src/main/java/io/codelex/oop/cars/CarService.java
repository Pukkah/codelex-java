package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CarService {
    private final List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Car> getCarsWithV12Engine() {
        return cars.stream()
                   .filter(car -> car.getEngineType() == EngineType.V12)
                   .toList();
    }

    public List<Car> getCarsProducedBefore1999() {
        return cars.stream()
                   .filter(car -> car.getYearOfManufacture() < 1999)
                   .toList();
    }

    public Car getCheapestCar() {
        List<Car> carsSortedByPrice = cars.stream()
                                          .sorted(Comparator.comparing(Car::getPrice))
                                          .toList();
        if (carsSortedByPrice.size() > 0) {
            return carsSortedByPrice.get(0);
        }
        return null;
    }

    public List<Car> getCarsWithAtLeast3Manufacturers() {
        return cars.stream()
                   .filter(car -> car.getManufacturerList().size() >= 3)
                   .toList();
    }

    public List<Car> getSortedCars(CarSortParameter parameter, boolean ascending) {
        return cars.stream()
                   .sorted(CarSortParameter.by(parameter, ascending))
                   .toList();
    }

    public boolean hasCarInList(Car car) {
        return cars.contains(car);
    }

    public List<Car> getCarsByManufacturer(Manufacturer manufacturer) {
        return cars.stream()
                   .filter(car -> car.getManufacturerList().contains(manufacturer))
                   .toList();
    }

    public List<Car> getCarsByManufacturerYearOfEstablishment(Operator operator, int year) {
        return cars.stream()
                   .filter(car ->
                           car.getManufacturerList()
                              .stream()
                              .filter(manufacturer ->
                                      operator.compare(year, manufacturer.getYearOfEstablishment())
                              )
                              .toList()
                              .size() > 0
                   )
                   .toList();
    }

}
