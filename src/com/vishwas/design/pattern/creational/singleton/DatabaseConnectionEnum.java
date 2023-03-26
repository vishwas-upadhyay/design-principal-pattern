package com.vishwas.design.pattern.creational.singleton;

public enum DatabaseConnectionEnum {
    //Enums are compiled time constants, and therefore it's thread safe by default.
    // As we are not using getInstance() with synchronization block hence it's fast.

    INSTANCE; // is equivalent to public static final INSTANCE = new DatabaseConnectionEnum();
    // Remember all enum get converted to class at compile time. Enum was introduced in java 1.5
    // for making it more lucrative than C and C++.

    public void connect(){
        System.out.println("Connecting to database ....");
    }

    public void disconnect(){
        System.out.println("disconnecting to database ....");
    }
}
