package com.learn.java.collections.impl;

import com.sun.org.apache.xpath.internal.objects.XNodeSetForDOM;

public class PriorityQueue<T extends PriorityObject> extends QueueImpl<T> {

    @Override
    public void enqueue(T element) {

        if(size == 0 || element.getPriority() < firstNode.value.getPriority()){
            firstNode = new LinkedNode<>(element, firstNode);
        }else{
            LinkedNode<T> node = firstNode;
            while(node.next != null && node.next.value.getPriority() <= element.getPriority()){
                node = node.next;
            }
            node.next = new LinkedNode<>(element, node.next);
        }
        size ++;
    }

}
