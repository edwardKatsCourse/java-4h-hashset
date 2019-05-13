package com.company;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {
        //bucket calculation -> hashCode
        //value search       -> equals

        Set<String> words = new HashSet<>();
        boolean isAppleAdded_1 = words.add("apple");

        System.out.printf("Apple added (1) -> %s\n", isAppleAdded_1);
        words.add("pineapple");
        words.add("cherry");

        boolean isMellonAdded = words.add("mellon");

        boolean isAppleAdded_2 = words.add("apple");

        System.out.printf("Mellon added -> %s\n", isMellonAdded);
        System.out.printf("Apple added (2) -> %s\n", isAppleAdded_2);


        System.out.println(words.toString());

        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(2);
        numbers.add(2);
        numbers.add(2);
        numbers.add(2);
        numbers.add(2);
        numbers.add(2);
        numbers.add(1000);
        numbers.add(1000);
        numbers.add(1000);
        numbers.add(1000);
        numbers.add(1000);
        numbers.add(1000);
        numbers.add(1000);

        System.out.println("Numbers size() " + numbers.size());

        Set<String> strings = new HashSet<>();
        strings.add("z");
        strings.add("z");
        strings.add("z");
        strings.add("z");
        strings.add("y");
        strings.add("y");
        strings.add("y");
        strings.add("y");
        strings.add("x");
        strings.add("x");
        strings.add("x");
        strings.add("x");
        strings.add("x");
        //3

        System.out.println("Strings size() " + strings.size());

        Set<Person> people = new HashSet<>();
        people.add(new Person("Jim", 80, 180));
        people.add(new Person("John", 80, 180));
        people.add(new Person("Sarah", 80, 180));
        people.add(new Person("Peter", 80, 180));
        people.add(new Person("Sam", 79, 180));

        System.out.println("People size() " + people.size());
        for (Person person : people) {
            System.out.println(person.toString());
        }


    }
}
class Person {
    private String name;
    private int weight;
    private int height;

    public Person(String name, int weight, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return weight == person.weight &&
                height == person.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, height);
    }

    @Override
    public String toString() {
        return String.format("Name: %s | Weight: %s | Height: %s",
                this.name,
                this.weight,
                this.height
        );
    }
}
