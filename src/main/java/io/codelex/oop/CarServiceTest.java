package io.codelex.oop;

import io.codelex.oop.cars.*;

import java.util.ArrayList;
import java.util.List;

public class CarServiceTest {
    public static void main(String[] args) {
        Manufacturer manufacturer1 = new Manufacturer("Audi Motors", 1990, "Germany");
        Manufacturer manufacturer2 = new Manufacturer("VW", 1973, "Germany");
        Manufacturer manufacturer3 = new Manufacturer("BMW GMBH", 2000, "Germany");
        List<Manufacturer> car1Manufacturers = new ArrayList<>();
        car1Manufacturers.add(manufacturer1);
        car1Manufacturers.add(manufacturer2);
        List<Manufacturer> car2Manufacturers = new ArrayList<>();
        car2Manufacturers.add(manufacturer3);
        Car car = new Car("Audi", "A3", 2000, 2002, car1Manufacturers, EngineType.V12);
        Car car2 = new Car("BMW", "X5", 3500, 2010, car2Manufacturers, EngineType.S4);
        CarService service = new CarService();
        service.addCar(car);
        service.addCar(car2);
        List<Car> carsWithV12 = service.getCarsWithV12Engine();
        System.out.println(carsWithV12);
        List<Car> weirdList = service.getCarsByManufacturerYearOfEstablishment(Operator.EQUAL_TO, 3000);
        System.out.println(weirdList);
        // TODO

    }

}
