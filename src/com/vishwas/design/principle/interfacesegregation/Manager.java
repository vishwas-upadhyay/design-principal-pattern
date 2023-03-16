package com.vishwas.design.principle.interfacesegregation;

public class Manager implements IManager{
    @Override
    public void addBonus() {
        System.out.println("addBonus");
    }

    @Override
    public void hire() {
        System.out.println("hire");
    }

    @Override
    public void train() {
        System.out.println("train");
    }

    @Override
    public void salary() {
        System.out.println("salary");
    }
}
