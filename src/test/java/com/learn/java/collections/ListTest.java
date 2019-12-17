package com.learn.java.collections;

import com.learn.java.collections.exceptions.EmptyCollectionException;
import com.learn.java.collections.exceptions.IndexNotFoundException;
import com.learn.java.collections.impl.ArrayList;
import com.learn.java.collections.impl.LinkedList;
import org.junit.Assert;
import org.junit.Test;

public class ListTest {

    @Test
    public void arrayListTest() throws EmptyCollectionException, IndexNotFoundException {
        List<Integer> list = new ArrayList();
        Assert.assertTrue(list.isEmpty());
        addTest(list);
        insertTest(list);
        Assert.assertEquals(50,list.find(50));
        Assert.assertEquals(-1, list.find(101));
        deleteTest(list);
    }

    @Test
    public void linkedListTest() throws EmptyCollectionException, IndexNotFoundException {
        List<Integer> list = new LinkedList();
        Assert.assertTrue(list.isEmpty());
        addTest(list);
        insertTest(list);
        Assert.assertEquals(50,list.find(50));
        Assert.assertEquals(-1, list.find(101));
        deleteTest(list);
    }

    @Test(expected = EmptyCollectionException.class)
    public void getArrayListEmptyCollectionTest() throws EmptyCollectionException {

        List<Integer> list = new ArrayList<>();
        list.get(0);
    }

    @Test(expected = EmptyCollectionException.class)
    public void removeAtArrayListEmptyCollectionTest() throws EmptyCollectionException, IndexNotFoundException {

        List<Integer> list = new ArrayList<>();
        list.removeAt(0);
    }

    @Test(expected = EmptyCollectionException.class)
    public void getLinkedListEmptyCollectionTest() throws EmptyCollectionException {

        List<Integer> list = new LinkedList<>();
        list.get(0);
    }

    @Test(expected = EmptyCollectionException.class)
    public void removeAtLinkedListEmptyCollectionTest() throws EmptyCollectionException, IndexNotFoundException {

        List<Integer> list = new LinkedList<>();
        list.removeAt(0);
    }

    @Test(expected = IndexNotFoundException.class)
    public void insertArrayListIndexNotFoundException() throws IndexNotFoundException {

        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(100);
        list.add(150);
        list.add(200);
        list.add(250);
        list.insert(300, 50);
    }

    @Test(expected = IndexNotFoundException.class)
    public void removeAtArrayListIndexNotFoundException() throws IndexNotFoundException, EmptyCollectionException {

        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(100);
        list.add(150);
        list.add(200);
        list.add(250);
        list.removeAt(17);
    }

    @Test(expected = IndexNotFoundException.class)
    public void insertLinkedListIndexNotFoundException() throws IndexNotFoundException {

        List<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(15);
        list.add(25);
        list.add(30);

        list.insert(35, 5);
    }

    @Test(expected = IndexNotFoundException.class)
    public void removeAtLinkedListIndexNotFoundException() throws IndexNotFoundException, EmptyCollectionException {

        List<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(15);
        list.add(25);
        list.add(30);
        list.removeAt(15);
    }

    private void addTest(List list) throws EmptyCollectionException {
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        Assert.assertFalse(list.isEmpty());
        Assert.assertEquals(0, list.get(0));
        Assert.assertEquals(99, list.get(99));
        Assert.assertEquals(100, list.size());
    }

    private void insertTest(List list) throws EmptyCollectionException, IndexNotFoundException {
        list.insert(100, 0);
        list.insert(150, 50);

        Assert.assertEquals(100, list.get(0));
        Assert.assertEquals(150, list.get(50));

        list.removeAt(50);
        list.removeAt(0);
    }

    private void deleteTest(List list) throws EmptyCollectionException, IndexNotFoundException {
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
