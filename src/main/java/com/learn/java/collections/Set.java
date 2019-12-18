package com.learn.java.collections;

public interface Set<T> {
    /**
     * The current amount of stored elements
     * @return
     */
    int size();

    /**
     * Stores a new element in the last position
     * but first, verify that element doesn't exist
     * @param element
     */
    boolean add(T element);

    /**
     * Find if exist the given element
     * and return T or F
     * @param element
     * @return
     */
    boolean find(T element);

    /**
     * Remove the given element
     * and return T or F if was removed
     * @param position
     */
    boolean remove(T element);


}
