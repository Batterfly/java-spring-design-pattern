package com.example.designer.commandPattern;

public class BTCCommand implements Command {
    private BTC btc;

    public BTCCommand(BTC btc) {
        this.btc = btc;
    }

    @Override
    public void addWarehouse() {
        btc.win();
    }

    @Override
    public void LightenUp() {
        btc.lost();
    }
}
