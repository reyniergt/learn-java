package com.learn.java.collections.impl;

import com.learn.java.collections.List;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;


public class ArrayList implements List {

    private int size;
    private int[] array;

    public ArrayList(){
        array = new int[10];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(int element) {

        if(array.length == size) {
            int[] arrayAux = new int[size + 10];
            for (int i = 0; i < array.length; i++) {
                arrayAux[i] = array[i];
            }
            array = arrayAux;
        }

        array[size] = element;
        size++;
    }

    @Override
    public int get(int position) {
        return array[position];
    }

    @Override
    public void removeAt(int position) {
        for (int i = position; i < size - 1; i++) {
            array[i] = array[i+1];
        }
        size --;
    }

    @Override
    public int find(int element) {
        for (int i = 0; i < size; i++) {
            if(array[i] == element){
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
