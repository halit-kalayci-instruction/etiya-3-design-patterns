package org.example.creational.builder.models;

public class Car {
    public int seats;
    public double fuel;
    public double enginePower;
    public String modelName;
    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", fuel=" + fuel +
                ", enginePower=" + enginePower +
                ", modelName='" + modelName + '\'' +
                '}';
    }
}

