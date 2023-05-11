package org.example.behavorial.template;

public class Football extends Game{
    @Override
    void initialize() {
        System.out.println("Football initialized");
    }

    @Override
    void playGame() {
        System.out.println("Football started");
    }

    @Override
    void end() {
        System.out.println("Football end");
    }
}
