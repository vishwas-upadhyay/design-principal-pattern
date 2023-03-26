package com.vishwas.design.pattern.creational.prototype;

public class Square extends Shape {

    public Square(int height, int width) {
        super(height, width);
    }

    @Override
    protected void draw() {
        System.out.println("Square is drawing with height : " + height + " and width : " + width);
    }

    @Override
    protected Square cloneObj() {
        return new Square(height, width);
    }
}
