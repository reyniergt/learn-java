package com.learn.java.collections;

import com.learn.java.collections.exceptions.EmptyCollectionException;

/**
 * Collection of elements with FIFO behaviour
 */
public interface Queue<T> {

    /**
     * adds a new element
     * @param element
     */
    void enqueue(T element);

    /**
     * removes and returns the first added element
     * @return
     */
    T dequeue() throws EmptyCollectionException;

    /**
     * returns the amount of elements
     * @return
     */
    int size();

    /**
     * returns true when there isnt any elements
     * @return
     */
    boolean isEmpty();
}
