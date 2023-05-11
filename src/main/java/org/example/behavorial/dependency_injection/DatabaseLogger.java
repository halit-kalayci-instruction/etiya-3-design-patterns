package org.example.behavorial.dependency_injection;

public class DatabaseLogger implements Logger {

    @Override
    public void log() {
        System.out.println("Database'e loglandı.");
    }
}
