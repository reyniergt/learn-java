package com.learn.java.collections.impl;

import com.learn.java.collections.Queue;
import com.learn.java.collections.exceptions.EmptyCollectionException;

public class QueueImpl<T> implements Queue<T> {

    protected int size;
    protected LinkedNode<T> firstNode;
    protected LinkedNode<T> lastNode;

    public QueueImpl(){
        size = 0;
        firstNode = null;
        lastNode = null;
    }

    @Override
    public void enqueue(T element) {
        if(size == 0){
            firstNode = new LinkedNode(element);
            lastNode = firstNode;
        }else{
            LinkedNode newNode = new LinkedNode(element);
            lastNode.next = newNode;
            lastNode = newNode;
        }
        size ++;
    }

    @Override
    public T dequeue() throws EmptyCollectionException {
        if(size == 0) {
            throw new EmptyCollectionException();
        }
        T value = firstNode.value;
        firstNode = firstNode.next;
        size --;
        return value;
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
