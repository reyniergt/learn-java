package com.learn.java.collections.impl;

import com.learn.java.collections.Stack;
import com.learn.java.collections.exceptions.EmptyCollectionException;

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
    public T pop() throws EmptyCollectionException {
        if(size == 0) {
            throw new EmptyCollectionException();
        }
        T value = firstNode.value;
        firstNode = firstNode.next;
        size --;
        return value;
    }

    @Override
    public T top() throws EmptyCollectionException {
        if(size == 0) {
            throw new EmptyCollectionException();
        }
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
