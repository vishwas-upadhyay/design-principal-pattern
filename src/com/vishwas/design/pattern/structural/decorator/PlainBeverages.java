package com.vishwas.design.pattern.structural.decorator;

public class PlainBeverages implements Beverage {

    public PlainBeverages(){
        System.out.println("PlainBeverages Constructor");
    }

    @Override
    public int getCost() {
        return 5;
    }

    @Override
    public String getDescription() {
        return "";
    }
}
