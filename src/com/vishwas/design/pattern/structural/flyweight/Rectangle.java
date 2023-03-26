package com.vishwas.design.pattern.structural.flyweight;

public class Rectangle implements Shape {
    int x;
    int y;
    String color;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Flyweight Object and Color is intrinsic data
    public Rectangle(String color) {
        this.color = color;
        System.out.println("Creating Rectangle object");
    }

    @Override
    public void draw() {
        System.out.println("Colour:" + this.color + " X:" + this.x + " Y:" + this.y);
    }
}
