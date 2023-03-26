package com.vishwas.design.pattern.creational.abstractfactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(CarType carType){
        if(carType == CarType.ELECTRIC){
            return new ElectricCarFactory();
        }
        else if(carType == CarType.PETROL){
            return new PetrolCarFactory();
        }
        return null;
    }
}
