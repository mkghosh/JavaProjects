package com.mithun.stacks;

/**
 * Created by Mithun Kumer Ghose on 4/2/2016.
 */
public class IntegerStack implements Stack<Integer> {

    private int topOfStack = -1;
    private int[] stackArray;

    public IntegerStack(int capacity) {
        stackArray = new int[capacity];
        topOfStack = -1;
    }

    @Override
    public Integer pop() {
        if(topOfStack != 0)
            return stackArray[topOfStack--];
        else
            return 0;
    }

    @Override
    public Integer peek() {
        return stackArray[topOfStack--];
    }

    @Override
    public void push(Integer integer) {
        stackArray[++topOfStack] = integer;
    }

    @Override
    public boolean isEmpty() {
        return topOfStack < 0;
    }

    @Override
    public boolean isFull() {
        return stackArray.length-1 == topOfStack;
    }
}
