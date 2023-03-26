package com.vishwas.design.pattern.creational.builder;

public class App {
    public static void main(String[] args) {
        Student student = new Student.Builder("Vishwas","RGTU").build();
        System.out.println(student);
    }
}
