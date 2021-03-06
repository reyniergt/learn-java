package com.learn.java.collections;

import com.learn.java.collections.exceptions.EmptyCollectionException;
import com.learn.java.collections.impl.QueueImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QueueTest {

    private Queue<Integer> queue;

    @Before
    public void setUp() {
       queue = new QueueImpl();
    }

    @Test
    public void enqueueDequeueTests() throws EmptyCollectionException {
        Assert.assertTrue("The queue should be empty",
                queue.isEmpty());

        Assert.assertEquals("The size should be 0",
                0, queue.size());

        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
            Assert.assertEquals(String.format("size should be %d", i + 1),
                    i + 1, queue.size());
        }

        Assert.assertFalse("queue should not be empty",
                queue.isEmpty());

        for (int i = 0; i < 10; i++) {
            Assert.assertEquals(String.format("removed element should be %d", i),
                    i, (int)queue.dequeue());
            Assert.assertEquals(String.format("size should be %d", 9 - i),
                    9 - i, queue.size());
        }

        Assert.assertTrue("The queue should be empty",
                queue.isEmpty());
    }


    @Test(expected = EmptyCollectionException.class)
    public void dequeueEmptyCollectionExceptionTest() throws EmptyCollectionException {
        queue.dequeue();
    }
}
