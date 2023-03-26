package com.vishwas.design.pattern.behavioral.command.producerconsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

//Invoker
public class Algorithm {

    BlockingQueue<Command> commandList;

    public Algorithm() {
        this.commandList = new LinkedBlockingQueue<Command>() {
        };
    }

    public void produce() {
        try {
            for (int i = 0; i < 10; i++) {
                commandList.add(new TaskSolver(new Task(i + 1)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void consume() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                commandList.take().execute();
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
