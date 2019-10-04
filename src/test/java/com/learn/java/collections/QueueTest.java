package com.learn.java.collections;

import com.learn.java.collections.impl.QueueImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QueueTest {

    private Queue queue;

    @Before
    public void setUp() {
        //TODO: instanciate the {@link queue}
        queue = new QueueImpl();
    }

    @Test
    public void enqueueDequeueTests() {
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
                    i, queue.dequeue());
            Assert.assertEquals(String.format("size should be %d", 9 - i),
                    9 - i, queue.size());
        }

        Assert.assertTrue("The queue should be empty",
                queue.isEmpty());
    }
}
