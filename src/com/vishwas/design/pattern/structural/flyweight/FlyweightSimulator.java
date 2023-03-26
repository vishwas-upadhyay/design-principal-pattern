package com.vishwas.design.pattern.structural.flyweight;

import java.util.Random;

public class FlyweightSimulator {
    private String[] colours = {"RED", "BLUE", "GREEN"};
    private Random random;
    private ShapeFactory shapeFactory;

    public FlyweightSimulator() {
        this.random = new Random();
        this.shapeFactory = new ShapeFactory();
    }

    public void run() {
        for (int i = 0; i < 30; i++) {
            Rectangle rectangle = (Rectangle) shapeFactory.getShape(getRandomColor());
            rectangle.setX(getRandomCoordinates());
            rectangle.setY(getRandomCoordinates());
            rectangle.draw();
        }
    }

    private String getRandomColor() {
        return colours[random.nextInt(colours.length)];
    }

    private int getRandomCoordinates() {
        return random.nextInt(50);
    }

}
