package com.vishwas.design.pattern.behavioral.command.producerconsumer;

//Receiver
public class Task {
    int id;

    public Task (int id){
        this.id=id;
    }

    public void execute(){
        System.out.println("Task is Solveed ! taskID:"+ id);
    }
}
