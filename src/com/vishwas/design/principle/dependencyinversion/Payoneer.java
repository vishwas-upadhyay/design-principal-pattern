package com.vishwas.design.principle.dependencyinversion;

public class Payoneer implements IPayment{
    @Override
    public void makePayment() {
        System.out.println("Payoneer payment");

    }

    @Override
    public void validateDetails() {
        System.out.println("Payoneer payment validation");

    }

    @Override
    public void paymentNotification() {
        System.out.println("Payoneer payment notification");

    }
}
