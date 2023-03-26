package com.vishwas.design.pattern.behavioral.strategy;

// IMPLEMENTATION OF STRATEGY
public class LaptopImageRenderer implements ImageRenderer{
    @Override
    public void showImage() {
        System.out.println("Laptop Image showing");
    }
}
