package com.vishwas.design.pattern.behavioral.visitor;

public interface Shape {
    void drawShape();

    // This method help us to achieve "Double Dispatch"
    // so that we can specifically invoke correct save()

    // If you use method overloading then always save() with supertype as input parameter will
    // get invoke and we won't be able to call correct save() hence accept () is mandatory
    void accept(Visitor visitor);

}
