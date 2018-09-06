package com.example.designer.commandPattern;

public class ETH implements Cryptographic{
    @Override
    public void win() {
        System.out.println("ETH earn");
    }

    @Override
    public void lost() {
        System.out.println("ETH lost");
    }
}
