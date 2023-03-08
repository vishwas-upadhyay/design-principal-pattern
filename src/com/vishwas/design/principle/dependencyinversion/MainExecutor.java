package com.vishwas.design.principle.dependencyinversion;

public class MainExecutor {

    public static void main(String[] args) {
        IDemo demo = new Demo();
        System.out.println(demo.test());
    }
}
