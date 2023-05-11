package org.example.behavorial.strategy;

public class CryptoStrategy implements Strategy {

    @Override
    public boolean pay(double amount) {
        System.out.println("Crypto ödendi:" + amount);

        return false;
    }
}
