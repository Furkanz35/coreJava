package com.furkan.zengin.corejava.collections.interfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorExample {
        //Iterable interface has abstract forEach, iterator and spliterator methods
        //Iterator interface has abstract hasNext, next, remove and forEach methods.

    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("Java");
        coll.add("C++");
        coll.add("C");
        coll.add("JavaScript");
        coll.add("Kotlin");
        coll.add("Swift");

        Iterator<String> it = coll.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("*****************************************");

        it = coll.iterator();
        while (it.hasNext()) {
            String tmp = it.next();
            if (tmp.length() > 5) {
                it.remove();
                System.out.println(tmp + " is deleted");
            }
        }

        System.out.println("*****************************************");

        coll.forEach(System.out::println);

    }

}
