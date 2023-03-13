package com.vishwas.design.principle.liskovsubstitution;

public abstract class Car implements ICar{
    String name;
    int age;

    public Car(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected void speedUp(){

        System.out.println("Car speeding up");
    }

    protected void slowDown(){
        System.out.println("Car slow down");
    }
}
