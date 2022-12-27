package com.furkan.zengin.corejava.collections.interfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IterableExample {

    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("Java");
        coll.add("C++");
        coll.add("C");
        coll.add("JavaScript");
        coll.add("Kotlin");
        coll.add("Swift");

        System.out.println("Elements in collection");
        coll.forEach(System.out::println);

        System.out.println("-----------------------------------------------------------");

        Iterator<String> iterable = coll.iterator(); //Iterable interface was implemented by collection, iterable interface has a iterator method
        //Iterable interface includes forEach, iterator and spliterator methods
      //  coll.add("PHP"); //if is there any update on collection after taking iterator, the first next invoke will throw ConcurrentModificationException
        while (iterable.hasNext()) {
            System.out.println(iterable.next());
        }

        System.out.println("-----------------------------------------------------------");

       //Arrays are not iterable objects!!!!!!!!!!!

        Iterable<String> iterable2 = coll;
        iterable2.forEach(e -> System.out.println(e + "   " + e.length()));

    }
}
