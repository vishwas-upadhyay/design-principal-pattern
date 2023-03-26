package com.vishwas.design.pattern.behavioral.observer;

public class StockBrokerSellListener implements Observer {

    public void sellStock() {
        System.out.println("StockBroker2 Sell Stock");
    }

    @Override
    public void subscribe(float stockPrice) {
        if (stockPrice >= 102) {
            sellStock();
        }
    }
}
