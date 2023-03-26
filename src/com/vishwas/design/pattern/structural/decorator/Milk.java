package com.vishwas.design.pattern.structural.decorator;

// As super class implements Beverage hence this class also implements it.
public class Milk extends BeverageDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
        System.out.println("Milk constructor");
    }

    @Override
    public int getCost() {
        return super.getCost() + 3;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " milk";
    }
}
