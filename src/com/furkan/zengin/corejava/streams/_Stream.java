package com.furkan.zengin.corejava.streams;

import com.furkan.zengin.corejava.functionalprogramming.imperative.ImperativeVersusDeclarative;

import java.util.List;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Aishe", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Maria", Gender.FEMALE)
        );

        List<Person> malePerson = people.stream()
                .filter(person -> person.gender == Gender.MALE)
                .toList();
        malePerson.forEach(System.out::println);

        System.out.println("-------------------");

        people.forEach(System.out::println);

        System.out.println("-------MAP-----------");
        people.stream()
                .map(person -> person.name)
                .forEach(System.out::println);
        System.out.println("----------------------");
        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("------AllMatches-----");
        boolean isIncludeOnlyFemales = people.stream()
                .allMatch(person -> Gender.FEMALE.equals(person.gender));
        System.out.println(isIncludeOnlyFemales);


        System.out.println("-------AnyMatch----------");
        boolean isListIncludeAtLeastOneFemale = people.stream()
                .anyMatch(person -> Gender.FEMALE.equals(person.gender));
        System.out.println(isListIncludeAtLeastOneFemale);

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


