package com.vishwas.design.pattern.creational.prototype;

public abstract class Shape {
    protected int width;
    protected int height;

    protected Shape(int height, int width){
        this.height = height;
        this.width = width;
    }

    protected abstract void draw();
    protected abstract Shape cloneObj();
}
