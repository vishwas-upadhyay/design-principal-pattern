package com.vishwas.design.pattern.structural.servicelocator;

public class DataBaseService implements Service {

    private static final String SERVICE_NAME = "dataBaseService";

    @Override
    public String getServiceName() {
        return SERVICE_NAME;
    }

    @Override
    public void execute() {
        System.out.println("Data Base Service is running");
    }
}
