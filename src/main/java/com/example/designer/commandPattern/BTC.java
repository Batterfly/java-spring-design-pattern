package com.example.designer.commandPattern;

public class BTC implements Cryptographic {

    @Override
    public void win() {
        System.out.println("BTC earn");
    }

    @Override
    public void lost() {
        System.out.println("BTC lost");
    }
}
