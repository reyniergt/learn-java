package com.learn.java.collections.impl;

import com.learn.java.collections.List;

public class LinkedList<T> implements List<T> {

    private int size;
    private LinkedNode<T> firstNode;
    private LinkedNode<T> lastNode;

    public LinkedList (){
        size = 0;
        firstNode = null;
        lastNode = null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(T element) {
        if(size == 0){
            firstNode = new LinkedNode(element);
            lastNode = firstNode;
        } else {
            LinkedNode next = new LinkedNode(element);
            lastNode.next = next;
            lastNode = next;
        }
        size ++;
    }

    @Override
    public T get(int position) {
        LinkedNode<T> node = firstNode;
        for (int i = 0; i < position; i++) {
            node = node.next;
        }
        return node.value;
    }

    @Override
    public void removeAt(int position) {
        if(position == 0){
            firstNode = firstNode.next;
        } else {
            LinkedNode node = firstNode;
            for (int i = 0; i < position -1; i++) {
                node = node.next;
            }
            node.next = node.next.next;

            if(node.next == null){
                lastNode = node;
            }
        }
        size --;
    }

    @Override
    public int find(T element) {
        LinkedNode node = firstNode;
        for (int i = 0; i < size; i++) {
            if(node.value == element) {
                return i;
            }
            node = node.next;
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void insert(T element, int position) {
        LinkedNode<T> newNode = new LinkedNode(element);
        if (position == 0) {
            newNode.next = firstNode;
            firstNode = newNode;
        } else {
            LinkedNode nodeAux = firstNode;
            for (int i = 0; i < position - 1; i++) {
                nodeAux = nodeAux.next;
            }
            newNode.next = nodeAux.next;
            nodeAux.next = newNode;
        }
        size++;
    }
}
