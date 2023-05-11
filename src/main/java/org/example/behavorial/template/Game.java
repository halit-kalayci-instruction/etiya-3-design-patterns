package org.example.behavorial.template;

public abstract class Game {
    abstract void initialize();
    abstract void playGame();
    abstract void end();

    public final void play(){
        initialize();
        playGame();
        end();
    }
}
