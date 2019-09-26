package com.learn.java.inheritance;

import org.junit.Assert;
import org.junit.Test;

public class RunnerTest {

    @Test
    public void testCatRunner() {
        Cat cat = new Cat();
        Assert.assertEquals("The Cat runs", cat.run());

    }

    @Test
    public void testDogRunner() {
        Dog dog = new Dog();
        Assert.assertEquals("The Dog runs", dog.run());

    }
}
