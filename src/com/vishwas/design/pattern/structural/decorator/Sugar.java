package com.vishwas.design.pattern.structural.decorator;

public class Sugar extends BeverageDecorator {

    public Sugar(Beverage beverage) {
        super(beverage);
        System.out.println("Sugar constructor");
    }

    @Override
    public int getCost() {
        return super.getCost() + 1;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " sugar";
    }
}
