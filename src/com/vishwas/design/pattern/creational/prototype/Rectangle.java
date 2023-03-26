package com.vishwas.design.pattern.creational.prototype;

public class Rectangle extends Shape {

    public Rectangle(int height, int width) {
        super(height, width);
    }

    @Override
    protected void draw() {
        System.out.println("Rectangle is drawing with height : " + height + " and width : " + width);
    }

    @Override
    protected Rectangle cloneObj() {
        return new Rectangle(height, width);
    }
}
