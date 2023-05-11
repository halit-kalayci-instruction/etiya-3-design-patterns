package org.example.behavorial.state;

public class StartState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Medya çalar başlatılıyor..");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "StartState";
    }
}
