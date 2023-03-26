package com.vishwas.design.pattern.behavioral.visitor;

public class Circle implements Shape {
    @Override
    public void drawShape() {
        System.out.println("Drawing circle .....");
    }

    // Implementation of accept()
    // Double Dispatch : Each object/class knows which exact method needs to be invoked.
    public void accept(Visitor visitor) {
        visitor.saveCircle(this);
    }
}
