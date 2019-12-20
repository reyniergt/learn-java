package com.learn.java.collections;

import com.learn.java.collections.exceptions.EmptyCollectionException;


/**
 * Collection of elements with LIFO behaviour
 */
public interface Stack<T> {

    /**
     * adds a new element
     * @param element
     */
    void push(T element);

    /**
     * removes and returns the last added element
     * @return
     */
    T pop() throws EmptyCollectionException;

    /**
     * returns the last added element without removing it
     * @return
     */
    T top() throws EmptyCollectionException;

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
