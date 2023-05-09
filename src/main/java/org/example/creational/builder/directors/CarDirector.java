package org.example.creational.builder.directors;

import org.example.creational.builder.builders.ICarBuilder;
import org.example.creational.builder.models.Car;

public class CarDirector {


    public Car constructSportCar(ICarBuilder carBuilder){
        carBuilder.setFuel(200);
        carBuilder.setSeats(2);
        carBuilder.setModelName("BMW");
        carBuilder.setEnginePower(100);
        return carBuilder.getCar();
    }

    public Car constructFamilyCar(ICarBuilder carBuilder){
        carBuilder.setFuel(50);
        carBuilder.setSeats(4);
        carBuilder.setModelName("Mercedes");
        carBuilder.setEnginePower(10);
        return carBuilder.getCar();
    }
}
