package com.vishwas.design.pattern.creational.abstractfactory;

public class ElectricCarFactory implements AbstractFactory{

    @Override
    public Car getCar(CarBrand brand){
        if(brand == CarBrand.FORD){
            return new ElectricFord();
        }
        else if( brand == CarBrand.TOYOTA){
            return new ElectricToyota();
        }
        return null;
    }
}
