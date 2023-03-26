package com.vishwas.design.pattern.creational.singleton;

public class DatabaseConnection {

    // This lazy version as we are not instantiating object like
    // public static DatabaseConnection INSTANCE = new DatabaseConnection(); // Eager version
    public static DatabaseConnection INSTANCE;

    private DatabaseConnection() {
    // Private constructor will not allow the other classes to instantiate the
    // DatabaseConnection object.
    // Privat Constructor are prune to "Reflection Attack"
    }

    public static DatabaseConnection getInstance() {
        if (INSTANCE == null) {
            // synchronized block is 100 times slower than non synchronized block.
            // Therefore, better version of singleton pattern will use Enum
            // for synchronization as Enum are by default threadsafe.
            synchronized (DatabaseConnection.class)
            {
                INSTANCE = new DatabaseConnection();
            }
        }

        return INSTANCE;
    }

    public void connect(){
        System.out.println("Connecting to database ....");
    }

    public void disconnect(){
        System.out.println("disconnecting to database ....");
    }
}
