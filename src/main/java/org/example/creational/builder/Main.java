package org.example.creational.builder;

import org.example.creational.builder.builders.CarBuilder;
import org.example.creational.builder.builders.ICarBuilder;
import org.example.creational.builder.directors.CarDirector;
import org.example.creational.builder.models.Car;

public class Main {
    public static void main(String[] args) {
        ICarBuilder carBuilder = new CarBuilder();
        carBuilder.setModelName("BMW");
        carBuilder.setSeats(6);
        carBuilder.setEnginePower(5);
        carBuilder.setFuel(210);

        Car car = carBuilder.getCar();
        System.out.println(car.toString());

        CarDirector carDirector = new CarDirector();
        Car familyCar = carDirector
                .constructFamilyCar(new CarBuilder());
        Car sportCar = carDirector
                .constructSportCar(new CarBuilder());

        System.out.println(familyCar.toString());
        System.out.println(sportCar.toString());
    }
}
