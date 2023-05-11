package org.example.behavorial.observer;

public class HexaConverter extends Observer {

    public HexaConverter(Subject subject) {
        this.subject = subject;
        this.subject.subscribe(this);
    }

    @Override
    public void update() {
        int number = this.subject.getNumber();
        System.out.println("Değişen yeni değerin hex değeri: " + Integer.toHexString(number));
    }
}
