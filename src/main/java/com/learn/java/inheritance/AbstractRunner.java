package com.learn.java.inheritance;

public abstract class AbstractRunner implements Runner {

    protected final String runner;

    protected AbstractRunner(String runner) {
        this.runner = runner;
    }

    public String run(){
        return "The " + runner + " runs";
    };
}
