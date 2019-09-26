package com.learn.java.inheritance;

public abstract class AbstractSwimmer implements Swimmer {

    protected final String swimmer;

    protected AbstractSwimmer(String swimmer) {
        this.swimmer = swimmer;
    }

    public String swim(){
        return "The" + swimmer + "swimms";
    };
}
