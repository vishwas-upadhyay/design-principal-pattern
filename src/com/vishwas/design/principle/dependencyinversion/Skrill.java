package com.vishwas.design.principle.dependencyinversion;

public class Skrill implements IPayment{
    @Override
    public void makePayment() {
        System.out.println("Skrill payment");

    }

    @Override
    public void validateDetails() {
        System.out.println("Skrill payment details");

    }

    @Override
    public void paymentNotification() {
        System.out.println("Skrill payment notification");

    }
}
