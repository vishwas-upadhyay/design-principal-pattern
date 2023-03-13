package com.vishwas.design.principle.liskovsubstitution;

public class ElectricCar extends Car {
    public ElectricCar(String name, int age) {
        super(name, age);
    }

    @Override
    protected void speedUp(){
        System.out.println("Electric car speeding up");
    }

    @Override
    protected void slowDown(){
        System.out.println("Electric Car slow down");
    }

    @Override
    public void fuel(){
        // This is design smell because ElecticCar class has to use parent class fuel()
        // or throw error or blank override. This breaks Liskov substitution principal
        // Remember : Inheritance is mainly for data reuse not for abstraction.
        // throw new Error("Electric car do not fuel up");


        // After making fuel() method abstract via abstract class or interface now we can implement fuel method the
        // way we want it.
        System.out.println("Electric car need electricity not fuel");
    }
}
