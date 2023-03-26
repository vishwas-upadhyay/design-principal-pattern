package com.vishwas.design.pattern.behavioral.visitor;

public class Triangle implements Shape {
    @Override
    public void drawShape() {
        System.out.println("Drawing triangle .....");
    }

    public void accept(Visitor visitor) {
        visitor.saveTriangle(this);
    }
}
