package org.example.creational.builder.builders;

import org.example.creational.builder.models.Car;

public interface ICarBuilder {
    void setSeats(int seats);
    void setFuel(double fuel);
    void setEnginePower(double enginePower);
    void setModelName(String modelName);
    Car getCar();
}
