package com.learn.java.collections.impl;

public abstract class PriorityObject {
    private final int priority;

    public PriorityObject(int priority) {
        this.priority = priority;
    }

    public int getPriority(){
        return priority;
    }
}
