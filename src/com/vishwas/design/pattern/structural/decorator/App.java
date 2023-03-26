package com.vishwas.design.pattern.structural.decorator;

/*
* A Decorator Pattern says that just "attach a flexible additional responsibilities to an object dynamically".
*
* In other words, The Decorator Pattern uses composition instead of inheritance to extend the functionality
* of an object at runtime.
*
* The Decorator Pattern is also known as Wrapper.
*
* */
public class App {
    public static void main(String[] args) {
        Beverage beverage = new Cappuccino(new Sugar(new Sugar(new Milk(new PlainBeverages()))));

        System.out.println("Cost:" + beverage.getCost() + "   Ingredient:" + beverage.getDescription());
    }
}
