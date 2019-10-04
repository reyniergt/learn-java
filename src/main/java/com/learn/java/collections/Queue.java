package com.learn.java.collections;

/**
 * Collection of elements with FIFO behaviour
 */
public interface Queue {

    /**
     * adds a new element
     * @param element
     */
    void enqueue(int element);

    /**
     * removes and returns the first added element
     * @return
     */
    int dequeue();

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
