package com.vishwas.design.principle.dependencyinversion;

public class Demo implements IDemo{
    @Override
    public String test() {
        System.out.println("Demo.test");
        return "demo";
    }
}
