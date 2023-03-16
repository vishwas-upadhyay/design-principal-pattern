package com.vishwas.design.pattern.abstractfactory;

public class PetrolCarFactory implements AbstractFactory{

    public Car getCar(CarBrand brand){
        if(brand == CarBrand.FORD){
            return new PetrolFord();
        }
        else if( brand == CarBrand.TOYOTA){
            return new PetrolToyota();
        }
        return null;
    }
}
