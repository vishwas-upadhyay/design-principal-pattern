package com.vishwas.design.pattern.creational.abstractfactory;

public class App {
    public static void main(String[] args) {
        Car car = FactoryProducer.getFactory(CarType.PETROL).getCar(CarBrand.FORD);
        car.assembly();

    }
}
