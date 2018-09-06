package com.example.designer.commandPattern;

public class ETHCommand implements Command {

    private ETH eth;

    public ETHCommand(ETH eth) {
        this.eth = eth;
    }

    @Override
    public void addWarehouse() {
        eth.win();
    }

    @Override
    public void LightenUp() {
        eth.lost();
    }
}
