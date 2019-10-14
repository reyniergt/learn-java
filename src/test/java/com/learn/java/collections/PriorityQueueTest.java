package com.learn.java.collections;

import com.learn.java.collections.impl.PriorityObject;
import com.learn.java.collections.impl.PriorityQueue;
import com.learn.java.collections.impl.QueueImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PriorityQueueTest {

    private PriorityQueue<PriorityObjectTest> queue;

    @Before
    public void setUp() {
        queue = new PriorityQueue<>();
    }

    @Test
    public void enqueueDequeueTests() {

        queue.enqueue(new PriorityObjectTest(100));
        queue.enqueue(new PriorityObjectTest(150));
        queue.enqueue(new PriorityObjectTest(200));
        queue.enqueue(new PriorityObjectTest(250));

        queue.enqueue(new PriorityObjectTest(50));
        queue.enqueue(new PriorityObjectTest(180));
        queue.enqueue(new PriorityObjectTest(200));

        //50, 100, 150, 180, 200, 200, 250
        Assert.assertEquals(50, queue.dequeue().getPriority());
        Assert.assertEquals(100, queue.dequeue().getPriority());
        Assert.assertEquals(150, queue.dequeue().getPriority());
        Assert.assertEquals(180, queue.dequeue().getPriority());
        Assert.assertEquals(200, queue.dequeue().getPriority());
        Assert.assertEquals(200, queue.dequeue().getPriority());
        Assert.assertEquals(250, queue.dequeue().getPriority());
    }

    private static class PriorityObjectTest extends PriorityObject {
        public PriorityObjectTest(int priority) {
            super(priority);
        }
    }
}
