package com.vishwas.design.pattern.structural.servicelocator;

public class InitialContext {

    public Service lookup(String jndiName) {

        switch (jndiName) {
            case "dataBaseService":
                System.out.println("DataBaseService is created");
                return new DataBaseService();

            case "messageService":
                System.out.println("MessagingService is created");
                return new MessagingService();

            default:
                return null;
        }
    }
}
