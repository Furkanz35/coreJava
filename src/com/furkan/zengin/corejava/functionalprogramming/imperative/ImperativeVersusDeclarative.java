package com.furkan.zengin.corejava.functionalprogramming.imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVersusDeclarative {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Aishe", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Maria", Gender.FEMALE)
                );

        //IMPERATIVE APPROACH
        System.out.println("IMPERATIVE APPROACH");
        List<Person> females = new ArrayList<>();
        for(Person person : people) {
            if(person.gender == Gender.FEMALE)
                females.add(person);
        }

        for(Person person : females)
            System.out.println(person );

        List<Person> males = new ArrayList<>();
        for(Person person : people) {
            if(person.gender == Gender.MALE)
                females.add(person);
        }


        //Declarative Approach
        System.out.println("DECLARATIVE APPROACH");
        List<Person> femalesWithDeclarative = people.stream()
                .filter(person -> Gender.FEMALE.equals(person.gender))
                .collect(Collectors.toList());

        femalesWithDeclarative.forEach(System.out::println);

    }

    static class Person{
        private final String name;
        private final Gender gender;

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }
    }

    enum Gender{
        MALE, FEMALE;
    }
}
