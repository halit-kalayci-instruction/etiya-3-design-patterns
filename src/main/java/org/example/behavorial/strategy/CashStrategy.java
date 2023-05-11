package org.example.behavorial.strategy;

public class CashStrategy implements Strategy {

    @Override
    public boolean pay(double amount) {
        System.out.println("Cash ödendi:" + amount);
        return false;
    }
}
