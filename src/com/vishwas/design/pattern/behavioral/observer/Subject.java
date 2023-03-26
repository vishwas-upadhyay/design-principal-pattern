package com.vishwas.design.pattern.behavioral.observer;

/**
 * SUBJECT INTERFACE
 */

public interface Subject {
    void addObserver(Observer observer);
    void notifyObservers();
}
