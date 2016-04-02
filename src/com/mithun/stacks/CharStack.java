package com.mithun.stacks;

/**
 * <h1>Stacks of characters.</h1>
 * Created by Mithun Kumer Ghose on 3/24/2016.
 */
public class CharStack implements Stack<Character> {

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

    /**
     * <h1>Pushes the element to the stack.</h1>
     * @param element {@link Character} element to push to the stack.
     */
    @Override
    public void push(Character element) {
        stackArray[++topOfStack] = element;
    }

    /**
     * <h1>Gives and removes the top element of the stack.</h1>
     * @return {@link Character} the top element of the stack.
     */
    @Override
    public Character pop() {
        if(topOfStack != 0)
            return stackArray[topOfStack--];
        else
            return 0;
    }

    /**
     * <h1>Gives the top element of the stack but not removes it.</h1>
     * @return {@link Character} top element of the stack.
     */
    @Override
    public Character peek() {
        return stackArray[topOfStack];
    }

    /**
     * <h1>Returns true if the stack has no elements false otherwise.</h1>
     * @return {@link Boolean} true if stack has no elements false instead.
     */
    @Override
    public boolean isEmpty() {
        return topOfStack < 0;
    }

    /**
     * <h1>Returns true if the stack's capacity is full false otherwise.</h1>
     * @return {@link Boolean} true if the stack is full.
     */
    @Override
    public boolean isFull() {
        return topOfStack == stackArray.length - 1;
    }
}
