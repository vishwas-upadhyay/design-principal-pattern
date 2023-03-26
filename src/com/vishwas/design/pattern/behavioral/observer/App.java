package com.vishwas.design.pattern.behavioral.observer;

public class App {
    public static void main(String[] args) {
        StockExchange stockExchange = new StockExchange();
        stockExchange.addObserver(new StockBrokerBuyListener());
        stockExchange.addObserver(new StockBrokerSellListener());
        stockExchange.start();
    }
}
