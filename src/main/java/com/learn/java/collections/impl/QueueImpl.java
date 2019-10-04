package com.learn.java.collections.impl;

import com.learn.java.collections.Queue;

public class QueueImpl implements Queue {

    private int size;
    private LinkedNode firstNode;
    private LinkedNode lastNode;

    public QueueImpl(){
        size = 0;
        firstNode = null;
    }

    @Override
    public void enqueue(int element) {
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
    public int dequeue() {
        int value = firstNode.value;
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

    private class LinkedNode {
        final int value;
        LinkedNode next;

        private LinkedNode(int value, LinkedNode next) {
            this.value = value;
            this.next = next;
        }

        private LinkedNode(int value) {
            this.value = value;
            this.next = null;
        }
    }
}
