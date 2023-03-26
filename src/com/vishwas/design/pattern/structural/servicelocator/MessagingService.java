package com.vishwas.design.pattern.structural.servicelocator;

public class MessagingService implements Service {

    private static final String SERVICE_NAME = "messagingService";

    @Override
    public String getServiceName() {
        return SERVICE_NAME;
    }

    @Override
    public void execute() {
        System.out.println("Messaging Service is running");
    }
}
