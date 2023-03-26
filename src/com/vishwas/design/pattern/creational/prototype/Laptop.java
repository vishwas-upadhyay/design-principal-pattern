package com.vishwas.design.pattern.creational.prototype;

public class Laptop implements Cloneable{

   private String name;

   public Laptop(String name){
       this.name = name;
   }

   public void printName(){
       System.out.println("Name of Laptop: " + this.name );
   }

   @Override
   protected Laptop clone() throws CloneNotSupportedException {
       return  (Laptop) super.clone();
   }
}
