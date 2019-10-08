package com.learn.java.collections.impl;

import com.learn.java.collections.Stack;

public class StackImpl<T> implements Stack<T> {
    private int size;
    private LinkedNode<T> firstNode;

    public StackImpl(){
        size = 0;
        firstNode = null;
    }

    @Override
    public void push(T element) {
        firstNode = new LinkedNode(element, firstNode);
        size ++;
    }

    @Override
    public T pop() {
        T value = firstNode.value;
        firstNode = firstNode.next;
        size --;
        return value;
    }

    @Override
    public T top() {
        return firstNode.value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
