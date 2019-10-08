package com.learn.java.collections.impl;

import com.learn.java.collections.Queue;

public class QueueImpl<T> implements Queue<T> {

    private int size;
    private LinkedNode<T> firstNode;
    private LinkedNode<T> lastNode;

    public QueueImpl(){
        size = 0;
        firstNode = null;
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
    public T dequeue() {
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
