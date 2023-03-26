package com.vishwas.design.pattern.behavioral.strategy;

// IMPLEMENTATION OF STRATEGY
public class TVImageRenderer implements ImageRenderer{
    @Override
    public void showImage() {
        System.out.println("TV Image showing");
    }
}
