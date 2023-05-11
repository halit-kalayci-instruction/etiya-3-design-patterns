package org.example.behavorial.command;

public class BuyCoinCommand implements Command{
    private Coin coin;

    public BuyCoinCommand(Coin coin) {
        this.coin = coin;
    }

    @Override
    public void execute() {
        coin.buy();
    }
}
