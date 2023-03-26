package com.vishwas.design.pattern.behavioral.visitor;

// Visitor concrete implementation
public class SaveVisitor implements Visitor{
    public void saveCircle(Circle circle){
        System.out.println("Saving circle ....");
    }

    public void saveRectangle(Rectangle rectangle){
        System.out.println("Saving rectangle ....");
    }

    public void saveTriangle(Triangle triangle){
        System.out.println("Saving triangle");
    }
}
