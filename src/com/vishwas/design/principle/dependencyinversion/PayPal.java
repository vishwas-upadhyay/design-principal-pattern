package com.vishwas.design.principle.dependencyinversion;

public class PayPal implements IPayment {

    @Override
    public void makePayment() {
        System.out.println("PayPal payment");
    }

    @Override
    public void validateDetails() {
        System.out.println("PayPal validate details");
    }

    @Override
    public void paymentNotification() {
        System.out.println("PayPal payment notification");
    }
}
