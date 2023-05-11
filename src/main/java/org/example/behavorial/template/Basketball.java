package org.example.behavorial.template;

public class Basketball extends Game{
    @Override
    void initialize() {
        System.out.println("Basketball Initialized");
    }

    @Override
    void playGame() {
        System.out.println("Basketball play");
    }

    @Override
    void end() {
        System.out.println("Basketball end");
    }
}
