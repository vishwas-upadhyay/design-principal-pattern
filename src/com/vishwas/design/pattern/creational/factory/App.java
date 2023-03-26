package com.vishwas.design.pattern.creational.factory;

public class App {
    public static void main(String[] args) {
        Animal animal = AnimalFactory.getAnimal(AnimalFactory.AnimalType.DOG);
        animal.eat();
    }
}
