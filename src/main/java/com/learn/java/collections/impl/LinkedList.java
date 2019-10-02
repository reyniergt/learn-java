package com.learn.java.collections.impl;

import com.learn.java.collections.List;
import com.sun.corba.se.impl.orb.ParserTable;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class LinkedList implements List {

    private int size;
    private LinkedNode firstNode;
    private LinkedNode lastNode;

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
    public void add(int element) {
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
    public int get(int position) {
        LinkedNode node = firstNode;
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
    public int find(int element) {
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
    public void insert(int element, int position) {
        LinkedNode newNode = new LinkedNode(element);
        if(position == 0){
            newNode.next = firstNode;
            firstNode = newNode;
        } else {
            LinkedNode nodeAux = firstNode;
            for (int i = 0; i < position -1; i++) {
                nodeAux = nodeAux.next;
            }
            newNode.next = nodeAux.next;
            nodeAux.next = newNode;
        }
        size ++;
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
