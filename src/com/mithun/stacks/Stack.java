package com.mithun.stacks;

/**
 * Created by Mithun Kumer Ghose on 4/2/2016.
 */
public interface Stack <T> {
    T pop();
    T peek();
    void push(T t);
    boolean isEmpty();
    boolean isFull();
}
