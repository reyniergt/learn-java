package com.learn.java.collections.impl;

import com.learn.java.collections.Stack;

public class StackImpl implements Stack {
    private int size;
    private LinkedNode firstNode;

    public StackImpl(){
        size = 0;
        firstNode = null;
    }

    @Override
    public void push(int element) {
        firstNode = new LinkedNode(element, firstNode);
        size ++;
    }

    @Override
    public int pop() {
        int value = firstNode.value;
        firstNode = firstNode.next;
        size --;
        return value;
    }

    @Override
    public int top() {
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
