package com.mithun.stacks;

/**
 * Created by Mithun Kumer Ghose on 3/24/2016.
 */
public class CharStack {
    //Needed to keep track of the top element of the stack.
    private int topOfStack = -1;
    private char[] stackArray;


    /**
     * <h1>This is the public constructor of the {@link CharStack} class.</h1>
     * @param capacity {@link Integer} The maximum capacity of the Character Stack.
     */
    public CharStack(int capacity) {
        stackArray = new char[capacity];
        topOfStack = -1;
    }

    public void push(char element) {
        stackArray[++topOfStack] = element;
    }
    public char pop() {
        return stackArray[topOfStack--];
    }
    public char peek() {
        return stackArray[topOfStack];
    }
    public boolean isEmpty() {
        return topOfStack < 0;
    }
    public boolean isFull() {
        return topOfStack == stackArray.length - 1;
    }
}
