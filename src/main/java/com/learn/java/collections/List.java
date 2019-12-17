package com.learn.java.collections;

import com.learn.java.collections.exceptions.EmptyCollectionException;
import com.learn.java.collections.exceptions.IndexNotFoundException;

/** A collection of elements that keeps insertion order **/
public interface List<T> {
    /**
     * The current amount of stored elements
     * @return
     */
    int size();

    /**
     * Stores a new element in the last position
     * @param element
     */
    void add(T element);

    /**
     * Get the element in the given position
     * @param position
     */
    T get(int position) throws EmptyCollectionException;

    /**
     * Remove the element in the given position
     * @param position
     */
    void removeAt(int position) throws EmptyCollectionException, IndexNotFoundException;

    /**
     * Find the position of the given element
     * @param element
     * @return
     */
    int find(T element);

    /**
     * Is the collection empty?
     * @return
     */
    boolean isEmpty();

    /**
     * Insert an element in a given position
     */
    void insert(T element, int position) throws IndexNotFoundException;
}
