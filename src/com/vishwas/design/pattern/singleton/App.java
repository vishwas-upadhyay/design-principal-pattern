package com.vishwas.design.pattern.singleton;

public class App {
    public static void main(String[] args) {
        DatabaseConnection.getInstance().connect();
        DatabaseConnection.getInstance().disconnect();

        DatabaseConnection obj1 = DatabaseConnection.getInstance();
        DatabaseConnection obj2 = DatabaseConnection.getInstance();

        if(obj1 == obj2){
            System.out.println("obj1 and obj2 is equivalent");
        }

        DatabaseConnectionEnum.INSTANCE.connect();
        DatabaseConnectionEnum.INSTANCE.disconnect();

        if(DatabaseConnectionEnum.INSTANCE == DatabaseConnectionEnum.INSTANCE){
            System.out.println("Enum object is also same");
        }

    }
}
