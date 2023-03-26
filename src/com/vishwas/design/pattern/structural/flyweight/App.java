package com.vishwas.design.pattern.structural.flyweight;
/*
* A Flyweight Pattern says that just "to reuse already existing similar kind of objects by storing
* them and create new object when no matching object is found".
*
* */

public class App {
    public static void main(String[] args) {
        FlyweightSimulator flyweightSimulator = new FlyweightSimulator();
        flyweightSimulator.run();
    }
}
