package com.learn.java.collections;

import com.learn.java.collections.impl.ArrayList;
import com.learn.java.collections.impl.LinkedList;
import org.junit.Assert;
import org.junit.Test;

public class ListTest {

    @Test
    public void arrayListTest() {
        List list = new ArrayList();
        Assert.assertTrue(list.isEmpty());
        addTest(list);
        insertTest(list);
        Assert.assertEquals(50,list.find(50));
        Assert.assertEquals(-1, list.find(101));
        deleteTest(list);
    }

    @Test
    public void linkedListTest() {
        List list = new LinkedList();
        Assert.assertTrue(list.isEmpty());
        addTest(list);
        insertTest(list);
        Assert.assertEquals(50,list.find(50));
        Assert.assertEquals(-1, list.find(101));
        deleteTest(list);
    }

    private void addTest(List list) {
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        Assert.assertFalse(list.isEmpty());
        Assert.assertEquals(0, list.get(0));
        Assert.assertEquals(99, list.get(99));
        Assert.assertEquals(100, list.size());
    }

    private void insertTest(List list) {
        list.insert(100, 0);
        list.insert(150, 50);

        Assert.assertEquals(100, list.get(0));
        Assert.assertEquals(150, list.get(50));

        list.removeAt(50);
        list.removeAt(0);
    }

    private void deleteTest(List list) {
        list.removeAt(99);
        Assert.assertEquals(99, list.size());
        list.removeAt(50);
        Assert.assertEquals(98, list.size());
        list.removeAt(0);
        Assert.assertEquals(1, list.get(0));
        while (!list.isEmpty()) {
            list.removeAt(0);
        }
        Assert.assertTrue(list.isEmpty());
    }
}
