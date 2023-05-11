package org.example.behavorial.state;

public class EndState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Medya çalar durduruluyor..");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "EndState";
    }
}
