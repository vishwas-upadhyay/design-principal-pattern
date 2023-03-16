package com.vishwas.design.principle.dependencyinversion;

public class Payment {

    IPayment payment;

    public Payment(IPayment payment){
        this.payment = payment;
    }

    public void makePayment(){
        this.payment.makePayment();
    }
}

