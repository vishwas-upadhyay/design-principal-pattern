package com.vishwas.design.pattern.behavioral.observer;

public class StockBrokerBuyListener implements Observer {

    public void buyStock() {
        System.out.println("StockBroker Buy stock");
    }

    @Override
    public void subscribe(float stockPrice) {
        if (stockPrice <= 98) {
            buyStock();
        }
    }
}
