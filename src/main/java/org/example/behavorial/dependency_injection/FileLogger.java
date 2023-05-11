package org.example.behavorial.dependency_injection;

public class FileLogger implements Logger {

    @Override
    public void log() {
        System.out.println("File'a loglandı");
    }
}
