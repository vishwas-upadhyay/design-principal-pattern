package com.vishwas.design.principle.dependencyinversion;

public class App {

    public static void main(String[] args) {
       Payment p = new Payment ( new Payoneer());
       p.makePayment();
    }
}
