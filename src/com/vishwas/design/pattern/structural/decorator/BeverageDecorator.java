package com.vishwas.design.pattern.structural.decorator;

public class BeverageDecorator implements Beverage {
// Composition of Beverage to facilitated Decorator pattern
    Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return this.beverage.getCost();
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription();
    }
}
