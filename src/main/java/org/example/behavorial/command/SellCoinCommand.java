package org.example.behavorial.command;

public class SellCoinCommand implements Command{
    private Coin coin;

    public SellCoinCommand(Coin coin) {
        this.coin = coin;
    }

    @Override
    public void execute() {
        coin.sell();
    }
}
