package com.learn.java.collections;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class PersonTest {

    private static class Person {
        private String id;
        private String name;
        private int age;
        private String address;

        public Person(String id, String name, int age, String address) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    @Test
    public void findPersonOkTest (){
        Person pepe = new Person("12345", "Pepe", 33, "Address 1");
        Person pablo = new Person("12346", "Pablo", 35, "Address 2");
        Person pedro = new Person("12347", "Pedro", 30, "Address 3");

        Set<Person> persons = new HashSet<>();
        Assert.assertTrue("Pepe couldn't be added", persons.add(pepe));
        Assert.assertTrue("Pablo couldn't be added",persons.add(pablo));
        Assert.assertTrue("Pedro couldn't be added",persons.add(pedro));

        Assert.assertFalse("Pepe was added, but is duplicated",
                persons.add(new Person("12345", "Pepe", 33, "Address 1")));

    }
}
