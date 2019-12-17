package com.learn.java.collections.impl;

import com.learn.java.collections.exceptions.EmptyCollectionException;
import com.learn.java.collections.List;
import com.learn.java.collections.exceptions.IndexNotFoundException;


public class ArrayList<T> implements List<T> {
    private int size;
    // O(1)
    private Object[] array;

    public ArrayList(){
        size = 0; // O(1)
        array = new Object[10];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(T element) {//n

        if(array.length == size) { //O(1)
            Object[] arrayAux = new Object[size + 10]; // 1
            for (int i = 0; i < array.length; i++) { //n
                arrayAux[i] = array[i]; // 1
            }
            array = arrayAux;//1
        }

        array[size] = element;//1
        size++;//1
    }

    @Override
    public T get(int position) throws EmptyCollectionException {//1
        if(isEmpty()){
            throw new EmptyCollectionException();
        }
        return (T)array[position];
    }

    @Override
    public void removeAt(int position) throws EmptyCollectionException, IndexNotFoundException {//n
        if(size == 0) {
            throw new EmptyCollectionException();
        }
        if(position > size){
            throw new IndexNotFoundException();
        }
        for (int i = position; i < size - 1; i++) {//n
            array[i] = array[i + 1];
        }
        size--;
    }

    @Override
    public int find(T element) {//n
        for (int i = 0; i < size; i++) {
            if(array[i] == element){
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {//1
        return size == 0;
    }

    @Override
    public void insert(T element, int position) throws IndexNotFoundException {

        if(array.length == size) {
            Object[] arrayAux = new Object[size + 10];
            for (int i = 0; i < array.length; i++) {
                arrayAux[i < position ? i : i + 1] = array[i];
            }
            array = arrayAux;
        }else {
            if(position > size) {
                throw new IndexNotFoundException();
            }
            for (int i = size - 1; i >= position; i--) {
                array[i + 1] = array[i];
            }
        }
        array[position] = element;
        size++;
    }
}
