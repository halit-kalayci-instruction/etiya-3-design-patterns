package org.example.creational.factory.logging;

public class FileLogging implements ILogging {

    @Override
    public void log() {
        System.out.println("File Logging");
    }
}
