package com.vishwas.design.pattern.behavioral.visitor;

public class Rectangle implements Shape {
    @Override
    public void drawShape() {
        System.out.println("Drawing " +
                "Ractangle .....");
    }

    public void accept(Visitor visitor) {
        visitor.saveRectangle(this);
    }

}
