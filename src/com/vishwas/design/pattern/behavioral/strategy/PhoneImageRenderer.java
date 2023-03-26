package com.vishwas.design.pattern.behavioral.strategy;

// IMPLEMENTATION OF STRATEGY
public class PhoneImageRenderer implements ImageRenderer{
    @Override
    public void showImage() {
        System.out.println("Phone Image showing");
    }
}
