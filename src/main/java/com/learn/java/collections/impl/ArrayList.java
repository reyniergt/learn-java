package com.learn.java.collections.impl;

import com.learn.java.collections.List;


public class ArrayList implements List {

    private int size;
    private int[] array;

    public ArrayList(){
        array = new int[10]; // O(1)
        size = 0; // O(1)
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(int element) {//n

        if(array.length == size) { //O(1)
            int[] arrayAux = new int[size + 10]; // 1
            for (int i = 0; i < array.length; i++) { //n
                arrayAux[i] = array[i]; // 1
            }
            array = arrayAux;//1
        }

        array[size] = element;//1
        size++;//1
    }

    @Override
    public int get(int position) {//1
        return array[position];
    }

    @Override
    public void removeAt(int position) {//n
        for (int i = position; i < size - 1; i++) {//n
            array[i] = array[i+1];
        }
        size --;
    }

    @Override
    public int find(int element) {//n
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
    public void insert(int element, int position) {

        if(array.length == size) {
            int[] arrayAux = new int[size + 10];
            for (int i = 0; i < array.length; i++) {
                arrayAux[i < position ? i : i + 1] = array[i];
            }
            array = arrayAux;
        }else {
            for (int i = size - 1; i >= position; i--) {
                array[i + 1] = array[i];
            }
        }
        array[position] = element;
        size++;
    }
}