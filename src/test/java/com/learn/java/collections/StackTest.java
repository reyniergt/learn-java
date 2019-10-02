package com.learn.java.collections;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackTest {

    private Stack stack;

    @Before
    public void setUp() {
        //TODO: instanciate the {@link stack}
    }

    @Test
    public void pushPopTests() {
        Assert.assertTrue("The stack should be empty",
                stack.isEmpty());

        Assert.assertEquals("The size should be 0",
                0, stack.size());

        for (int i = 0; i < 10; i++) {
            stack.push(i);
            Assert.assertEquals(String.format("size should be %d", i + 1),
                    i + 1, stack.size());
            Assert.assertEquals(String.format("top should be %d", i),
                    i, stack.top());
        }

        Assert.assertFalse("stack should not be empty",
                stack.isEmpty());

        for (int i = 9; i >= 0; i--) {
            Assert.assertEquals(String.format("removed element should be %d", i),
                    i, stack.pop());
            Assert.assertEquals(String.format("size should be %d", i),
                    i, stack.size());
        }

        Assert.assertTrue("The stack should be empty",
                stack.isEmpty());
    }
}
