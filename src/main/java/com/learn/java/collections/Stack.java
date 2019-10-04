package com.learn.java.collections;

/**
 * Collection of elements with LIFO behaviour
 */
public interface Stack {

    /**
     * adds a new element
     * @param element
     */
    void push(int element);

    /**
     * removes and returns the last added element
     * @return
     */
    int pop();

    /**
     * returns the last added element without removing it
     * @return
     */
    int top();

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
