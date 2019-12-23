package com.learn.java.collections;

public interface Set<T> {
    /**
     * The current amount of stored elements
     * @return
     */
    int size();

    /**
     * Stores the element if it doesn't exists yet
     * @param element
     */
    boolean add(T element);

    /**
     * Find if exist the given element
     * @param element
     * @return
     */
    boolean find(T element);

    /**
     * Remove the given element
     * @param position
     */
    boolean remove(T element);


}
