package com.learn.java.collections;

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
    T get(int position);

    /**
     * Remove the element in the given position
     * @param position
     */
    void removeAt(int position);

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
    void insert(T element, int position);
}
