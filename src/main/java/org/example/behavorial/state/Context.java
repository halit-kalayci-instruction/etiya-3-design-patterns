package org.example.behavorial.state;

public class Context {
    private State state;

    public Context() {
        this.state = null;
    }

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
