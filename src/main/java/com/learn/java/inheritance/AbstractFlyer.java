package com.learn.java.inheritance;

public abstract class AbstractFlyer implements Flyer {

    protected final String flyer;

    protected AbstractFlyer(String flyer) {
        this.flyer = flyer;
    }

    public String fly(){
        return "The " + flyer + " flies";
    };
}
