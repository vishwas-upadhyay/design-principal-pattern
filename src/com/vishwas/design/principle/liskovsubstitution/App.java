package com.vishwas.design.principle.liskovsubstitution;

public class App {
    public static void main(String[] args) {
        Car car = new PetrolCar("Ford", 10);
        car.speedUp();
        car.slowDown();
        car.fuel();
    }
}
