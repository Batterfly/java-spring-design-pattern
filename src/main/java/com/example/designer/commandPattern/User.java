package com.example.designer.commandPattern;

import java.util.ArrayList;

public class User {
    ArrayList commands;

    public User() {
        commands = new ArrayList();
    }

    public void setCommand(Command command) {
        commands.add(command);
    }

    public void onCryptoWasPushed(int slot) {
        ((Command) commands.get(slot - 1)).addWarehouse();
    }

    public static void main(String[] args) {
        User user = new User();
        BTC btc = new BTC();
        ETH eth = new ETH();
        BTCCommand btcCommand = new BTCCommand(btc);
        ETHCommand ethCommand=new ETHCommand(eth);
        user.setCommand(btcCommand);
        user.setCommand(ethCommand);
        user.onCryptoWasPushed(1);
        user.onCryptoWasPushed(2);
    }
}
