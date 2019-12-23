package com.learn.java.collections.impl;

import com.learn.java.collections.Set;
public class SetImpl<T> implements Set<T> {

    public int size;
    private LinkedNode<T> firstNode;
    private LinkedNode<T> lastNode;

    public SetImpl(){
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
            }else {
                LinkedNode next = new LinkedNode(element);
                lastNode.next = next;
                lastNode = next;
            }
        }
        size ++;
        return true;
    }

    @Override
    public boolean find(T element) {
        LinkedNode<T> nodeAux = firstNode;
        for (int i = 0; i < size; i++) {
            if (nodeAux.value.equals(element)) {
                return true;
            }
            nodeAux = nodeAux.next;
        }
        return false;
    }

    @Override
    public boolean remove(T element) {
        if(size != 0) {
            if (firstNode.value.equals(element)) {
                firstNode = firstNode.next;
                size--;
                return true;
            } else {
                LinkedNode<T> nodeAux = firstNode;
                for (int i = 0; i < size; i++) {
                    if (nodeAux.next != null && nodeAux.next.value.equals(element)) {
                        nodeAux.next = nodeAux.next.next;
                        size--;
                        if (nodeAux == null) {
                            lastNode = nodeAux;
                        }
                        return true;
                    }
                    nodeAux = nodeAux.next;
                }
            }
        }
        return false;
    }
}
