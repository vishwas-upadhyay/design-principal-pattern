package com.vishwas.design.principle.interfacesegregation;

public class App {
    public static void main(String[] args) {
        // IEmployeeFat is the Fat interface here which we segregated into
        // IEmployee , IManager , ICEO


        ICEO ceo = new CEO();
        ceo.addBonus();
        ceo.addStocks();
        ceo.makeDecisions();
        ceo.salary();
    }
}
