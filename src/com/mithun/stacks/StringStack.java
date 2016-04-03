package com.mithun.stacks;

/**
 * Created by Mithun Kumer Ghose on 4/3/2016.
 */
public class StringStack implements Stack<String> {

    //instance variables
    private int topOfTheStack = -1;
    private String[] stringStack;

    public StringStack(int capacity) {
        stringStack = new String[capacity];
    }


    @Override
    public String pop() {
        if(isEmpty()) return null;

        return stringStack[topOfTheStack--];
    }

    @Override
    public String peek() {
        if(isEmpty()) return null;

        return stringStack[topOfTheStack];
    }

    @Override
    public void push(String string) {
        stringStack[++topOfTheStack] = string;
    }

    @Override
    public boolean isEmpty() {
        return topOfTheStack == -1;
    }

    @Override
    public boolean isFull() {
        return topOfTheStack == stringStack.length - 1;
    }
}
