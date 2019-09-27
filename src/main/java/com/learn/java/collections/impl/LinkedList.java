package com.learn.java.collections.impl;

import com.learn.java.collections.List;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class LinkedList implements List {

    private int size;
    private LinkedNode firstNode;

    @Override
    public int size() {
        throw new NotImplementedException();
    }

    @Override
    public void add(int element) {
        throw new NotImplementedException();
    }

    @Override
    public int get(int position) {
        throw new NotImplementedException();
    }

    @Override
    public void removeAt(int position) {
        throw new NotImplementedException();
    }

    @Override
    public int find(int element) {
        throw new NotImplementedException();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    private class LinkedNode {
        final int value;
        final LinkedNode next;

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
