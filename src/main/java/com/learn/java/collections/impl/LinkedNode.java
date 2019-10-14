package com.learn.java.collections.impl;

class LinkedNode<T> {
    final T value;
    LinkedNode<T> next;

    LinkedNode(T value, LinkedNode next) {
        this.value = value;
        this.next = next;
    }

    LinkedNode(T value) {
        this.value = value;
        this.next = null;
    }
}
