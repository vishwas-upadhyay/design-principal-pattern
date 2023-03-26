package com.vishwas.design.pattern.behavioral.iterator;

public class NameRepository {
    private String[] names;

    public NameRepository(String[] names) {
        this.names = names;

    }

    public NameIterator getNameIterator() {
        return new NameIterator(names);
    }

}

