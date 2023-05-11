package org.example.behavorial.strategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new CashStrategy());
        System.out.println(context.executePayment(500));

        context.strategy = new CryptoStrategy();
        System.out.println(context.executePayment(500));
    }
}
