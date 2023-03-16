package com.vishwas.design.principle.interfacesegregation;

public class Worker implements IEmployee{
    @Override
    public void salary() {
        System.out.println("Salary");
    }
}
