package org.example.creational.factory.logging;

public class DatabaseLogging implements ILogging{
    @Override
    public void log() {
        System.out.println("Database Logging");
    }
}

