package org.example.behavorial.null_object.loggers;

public class DatabaseLogger implements ILogger {
    @Override
    public void log() {
        System.out.println("Database'e loglandı.");
    }
}
