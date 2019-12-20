package com.learn.java.collections;

import com.learn.java.collections.exceptions.EmptyCollectionException;
import com.learn.java.collections.impl.StackImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackTest {

    private Stack<Integer> stack;

    @Before
    public void setUp() {
        stack = new StackImpl<>();
    }

    @Test
    public void pushPopTests() throws EmptyCollectionException {
        Assert.assertTrue("The stack should be empty",
                stack.isEmpty());

        Assert.assertEquals("The size should be 0",
                0, stack.size());

        for (int i = 0; i < 10; i++) {
            stack.push(i);
            Assert.assertEquals(String.format("size should be %d", i + 1),
                    i + 1, stack.size());
            Assert.assertEquals(String.format("top should be %d", i),
                    i, (int)stack.top());
        }

        Assert.assertFalse("stack should not be empty",
                stack.isEmpty());

        for (int i = 9; i >= 0; i--) {
            Assert.assertEquals(String.format("removed element should be %d", i),
                    i, (int)stack.pop());
            Assert.assertEquals(String.format("size should be %d", i),
                    i, stack.size());
        }

        Assert.assertTrue("The stack should be empty",
                stack.isEmpty());
    }

    @Test(expected = EmptyCollectionException.class)
    public void popEmptyCollectionExceptionTest() throws EmptyCollectionException {
        stack.pop();
    }

    @Test(expected = EmptyCollectionException.class)
    public void topEmptyCollectionExceptionTest() throws EmptyCollectionException {
        stack.top();
    }
}
