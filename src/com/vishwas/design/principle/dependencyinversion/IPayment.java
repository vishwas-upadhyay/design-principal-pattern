package com.vishwas.design.principle.dependencyinversion;

public interface IPayment {
    public void makePayment();
    public void validateDetails();
    public void paymentNotification();
}
