package org.example.creational.factory.factories;

import org.example.creational.factory.logging.DatabaseLogging;
import org.example.creational.factory.logging.ILogging;

public class DatabaseLoggingFactory extends LoggingFactory{
    @Override
    public ILogging createLogger() {
        return new DatabaseLogging();
    }
}
