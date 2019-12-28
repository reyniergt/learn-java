package com.learn.java.collections;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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

        @Override
        public int hashCode() {
            return id.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            return obj instanceof Person && id.equals(((Person) obj).id);
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

    @Test
    public void countOfRepeatedPersonsTest () {
        Person[] persons = new Person[]{
                new Person("123", "Person1",25, "1"),
                new Person("1234", "Person2",25, "1"),
                new Person("123", "Person1",25, "1"),
                new Person("123", "Person1",25, "1"),
                new Person("1234", "Person2",25, "1"),
                new Person("123", "Person1",25, "1")
        };

        Map<Person, Integer> mapPersons = countOfRepeatedPersons(persons);

        Assert.assertEquals(4, mapPersons.get(new Person("123", "Person1",25, "1")).intValue());
        Assert.assertEquals(2, mapPersons.get(new Person("1234", "Person1",25, "1")).intValue());
    }

    private static Map<Person, Integer> countOfRepeatedPersons(Person[] persons){
        Map<Person, Integer> mapPersons = new HashMap<>();
        for (int i = 0; i < persons.length; i++) {
            int value = mapPersons.getOrDefault(persons[i], 0);
            mapPersons.put(persons[i], value + 1);
        }
        return mapPersons;
    }
}
