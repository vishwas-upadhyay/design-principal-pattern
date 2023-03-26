package com.vishwas.design.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    public Map<String,Shape> shapeMap;

    public ShapeFactory (){
        this.shapeMap = new HashMap<>();
    }

    public Shape getShape(String color){
        if(shapeMap.containsKey(color)){
            return shapeMap.get(color);
        }
        Shape shape = new Rectangle(color);
        shapeMap.put(color,shape);
        return shape;
    }

}
