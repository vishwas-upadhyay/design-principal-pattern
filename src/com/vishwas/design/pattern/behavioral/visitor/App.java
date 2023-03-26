package com.vishwas.design.pattern.behavioral.visitor;

import java.util.Arrays;
import java.util.List;

/*
 * Visitor is a behavioral design pattern that lets you separate algorithms
 * from the objects on which they operate.
 *
 *
 * */
public class App {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(new Triangle(), new Circle(), new Rectangle());
        SaveVisitor saveVisitor = new SaveVisitor();
        shapeList.stream().forEach(shape -> shape.accept(saveVisitor));
    }
}
