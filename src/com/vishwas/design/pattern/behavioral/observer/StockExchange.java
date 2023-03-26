package com.vishwas.design.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
* SUBJECT OBJECT (PRODUCER) IS ONE THAT OBSERVER (CONSUMER) ARE SUBSCRIBE TO.
*
* */
public class StockExchange implements Subject {

    private float price = 100;
    private Random random;
    private List<Observer> observerList;

    public StockExchange() {
        this.random = new Random();
        this.observerList = new ArrayList<Observer>();
    }

    public void start() {
        while (true) {
            try {
                Thread.sleep(500);
                price = price + 2 * random.nextFloat() - 1;
                notifyObservers();
                System.out.println(price);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.subscribe(price);
        }
    }
}
