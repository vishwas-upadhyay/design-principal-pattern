package com.vishwas.design.pattern.structural.decorator;

public class Cappuccino extends BeverageDecorator{
    public Cappuccino(Beverage beverage) {
        super(beverage);
        System.out.println("Cappuccino constructor");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Cappochino";
    }

    @Override
    public int getCost() {
        return super.getCost() + 2;
    }
}
