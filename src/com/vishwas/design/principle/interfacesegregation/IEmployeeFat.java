package com.vishwas.design.principle.interfacesegregation;

public interface IEmployeeFat {

    // CEO + managers + workers
    public void salary();
    // managers
    public void hire();
    public void train();
    // CEO + managers
    public void addBonus();
    // CEO
    public void makeDecisions();
    public void addStocks();

}
