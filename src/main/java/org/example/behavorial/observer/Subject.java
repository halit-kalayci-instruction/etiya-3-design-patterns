package org.example.behavorial.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private int number;
    private int number2;



    private List<Observer> subscribers = new ArrayList<>();

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        this.notifyAllSubscribers();
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void subscribe(Observer observer){
        this.subscribers.add(observer);
    }
    public void notifyAllSubscribers(){
        for(Observer observer: subscribers){
            observer.update();
        }
    }
}
