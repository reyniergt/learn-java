package com.learn.java.collections;
import com.learn.java.collections.impl.SetImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SetTest {

    Set<Integer> set;

    @Before
    public void setUp(){ set = new SetImpl(); }

    @Test
    public void addTestOk() {
        Assert.assertEquals(true, set.add(100));
        Assert.assertEquals(true, set.add(200));
        Assert.assertEquals(true, set.add(300));
        Assert.assertEquals(true, set.add(400));

        Assert.assertEquals(4, set.size());
        Assert.assertEquals(true, set.find(400));
    }

    @Test
    public void addTestFailed1() {
        Assert.assertEquals(true, set.add(100));
        Assert.assertEquals(true, set.add(200));
        Assert.assertEquals(true, set.add(300));
        Assert.assertEquals(false, set.add(100));

        Assert.assertEquals(3, set.size());
        Assert.assertEquals(true, set.find(200));
        Assert.assertEquals(false, set.find(500));
    }

    @Test
    public void addTestFailed2() {
        Assert.assertEquals(true, set.add(100));
        Assert.assertEquals(true, set.add(200));
        Assert.assertEquals(true, set.add(300));
        Assert.assertEquals(false, set.add(300));

        Assert.assertEquals(3, set.size());
        Assert.assertEquals(true, set.find(100));
        Assert.assertEquals(false, set.find(500));
    }

    @Test
    public void removeTestOk() {
        Assert.assertEquals(true, set.add(100));
        Assert.assertEquals(true, set.add(200));
        Assert.assertEquals(true, set.add(300));
        Assert.assertEquals(true, set.add(400));
        Assert.assertEquals(true, set.add(500));

        Assert.assertEquals(5, set.size());
        Assert.assertEquals(true, set.find(500));
        Assert.assertEquals(true, set.remove(500));
        Assert.assertEquals(4, set.size());
        Assert.assertEquals(false, set.find(500));
    }

    @Test
    public void removeTestFailed() {
        Assert.assertEquals(true, set.add(100));
        Assert.assertEquals(true, set.add(200));
        Assert.assertEquals(true, set.add(300));
        Assert.assertEquals(3, set.size());
        Assert.assertEquals(false, set.remove(250));
        Assert.assertEquals(3, set.size());
    }



}
