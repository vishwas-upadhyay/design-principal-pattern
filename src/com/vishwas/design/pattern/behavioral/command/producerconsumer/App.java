package com.vishwas.design.pattern.behavioral.command.producerconsumer;

public class App {
    public static void main(String[] args) {

        Algorithm algorithm = new Algorithm();

        Thread producer = new Thread() {
            @Override
            public void run() {
                algorithm.produce();
            }
        };

        Thread consumer = new Thread() {
            @Override
            public void run() {
                algorithm.consume();

            }
        };

        producer.start();
        consumer.start();

    }
}
