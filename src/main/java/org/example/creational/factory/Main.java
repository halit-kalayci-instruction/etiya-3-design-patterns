package org.example.creational.factory;


import org.example.creational.factory.factories.DatabaseLoggingFactory;
import org.example.creational.factory.factories.LoggingFactory;
import org.example.creational.factory.logging.DatabaseLogging;
import org.example.creational.factory.logging.FileLogging;
import org.example.creational.factory.logging.ILogging;

public class Main {
    public static void main(String[] args) {
        LoggingFactory loggingFactory = new DatabaseLoggingFactory();

        ILogging logging1 = loggingFactory.createLogger();
        logging1.log();


        ILogging logging2 = loggingFactory.createLogger();
        logging2.log();


        ILogging logging3 = loggingFactory.createLogger();
        logging3.log();


        ILogging logging4 = loggingFactory.createLogger();
        logging4.log();
    }
}
//14.15
