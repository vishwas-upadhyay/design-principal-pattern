package com.vishwas.design.pattern.creational.prototype;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Shape shape = new Rectangle(10,15);
        shape.draw();
        Shape shape1 = shape.cloneObj();
        shape1.draw();

        Laptop laptop = new Laptop("MacPro");
        laptop.printName();
        Laptop laptop1 = laptop.clone();
        laptop1.printName();

    }
}
