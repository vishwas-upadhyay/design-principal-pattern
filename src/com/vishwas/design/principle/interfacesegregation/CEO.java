package com.vishwas.design.principle.interfacesegregation;

public class CEO implements ICEO{
    @Override
    public void addBonus() {
        System.out.println("addBonus");
    }

    @Override
    public void makeDecisions() {
        System.out.println("makeDecisions");

    }

    @Override
    public void addStocks() {
        System.out.println("addStocks");

    }

    @Override
    public void salary() {
        System.out.println("salary");

    }
}
