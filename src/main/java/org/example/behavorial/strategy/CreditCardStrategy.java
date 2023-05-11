package org.example.behavorial.strategy;

public class CreditCardStrategy implements Strategy {

    @Override
    public boolean pay(double amount) {
        System.out.println("Kartla ödendi:" + amount);

        return false;
    }
}
