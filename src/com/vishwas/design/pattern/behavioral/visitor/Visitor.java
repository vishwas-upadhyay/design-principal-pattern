package com.vishwas.design.pattern.behavioral.visitor;
//
// Separating behaviour from Objects (Circle,Triangle,Rectangle)
//
// Visitor interface for defining save behavior
public interface Visitor {

    void saveCircle(Circle circle);
    void saveRectangle(Rectangle shape);
    void saveTriangle(Triangle shape);

}
