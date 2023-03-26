package com.vishwas.design.pattern.behavioral.strategy;

public class App {
    public static void main(String[] args) {
        // GETTING CONTEXT OBJECT
        ImageManager imageManager = new ImageManager();
        // SETTING BEHAVIOR/STRATEGY
        // IF NEW STRATEGY INTRODUCED WE JUST NEED TO PASS FROM HIGH LEVEL
        // AND IT WILL WORK WITHOUT MAKING TOO MANY CHANGES
        imageManager.setRenderer(new LaptopImageRenderer());
        // EXECUTING BEHAVIOR/STRATEGY
        // WITHOUT CHANGING CODE IN CONTEXT WE CAN ADD NEW STRATEGIES
        imageManager.show();
    }
}
