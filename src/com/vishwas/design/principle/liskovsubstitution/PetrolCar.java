package com.vishwas.design.principle.liskovsubstitution;

public class PetrolCar extends Car{
    public PetrolCar(String name, int age) {
        super(name, age);
    }

    @Override
    protected void speedUp(){

        System.out.println("Petrol Car speeding up");
    }

    @Override
    protected void slowDown(){
        System.out.println("Petrol Car slow down");
    }

    @Override
    public void fuel(){

        System.out.println("Petrol Car fueled up");
    }
}
