package com.learn.java.collections.impl;

import com.learn.java.collections.Set;

public class SetList<T> implements Set<T> {

    public int size;
    private LinkedNode<T> firstNode;
    private LinkedNode<T> lastNode;

    public SetList(){
        size = 0;
        firstNode = null;
        lastNode = null;
    }

    @Override
    public int size() { return size; }

    @Override
    public boolean add(T element) {//n

        if(size == 0){
            firstNode = new LinkedNode(element);
            lastNode = firstNode;
        } else {
            if(find(element)){
                return false;
            }
            LinkedNode next = new LinkedNode(element);
            lastNode.next = next;
            lastNode = next;
        }
        size ++;
        return true;
    }

    @Override
    public boolean find(T element) {
        if(size == 0 && firstNode.value == element){
            return true;
        }
        LinkedNode<T> nodeAux = firstNode;
        for (int i = 0; i < size; i++) {
            if(nodeAux.value == element){
                return true;
            }
            nodeAux = nodeAux.next;
        }
        return false;
    }

    @Override
    public boolean remove(T element) {
        if(size == 0 && firstNode.value == element){
            firstNode = null;
            return true;
        }
        LinkedNode<T> nodeAux = firstNode;
        for (int i = 0; i < size; i++) {
            if(nodeAux.value == element){

                return true;
            }
            nodeAux = nodeAux.next;
        }
        return false;
    }
}
