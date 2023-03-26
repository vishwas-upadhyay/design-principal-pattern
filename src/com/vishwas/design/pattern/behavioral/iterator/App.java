package com.vishwas.design.pattern.behavioral.iterator;

import java.util.Stack;

public class App {
    public static void main(String[] args) {

        NameRepository nameRepository = new NameRepository(new String[]{"Alan", "Bob", "Rob", "Sam"});
        Iterator iterator = nameRepository.getNameIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Stack stack = new Stack();
        stack.add(10);
        stack.add(20);
        stack.add(30);
        java.util.Iterator iterator1 = stack.iterator();

        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
