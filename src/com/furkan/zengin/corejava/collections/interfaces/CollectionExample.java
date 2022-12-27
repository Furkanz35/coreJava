package com.furkan.zengin.corejava.collections.interfaces;

import java.util.*;


public class CollectionExample {

    public static void main(String[] args) {

        Collection<Object> coll = new ArrayList<>();

        coll.add("Java");
        coll.add("C++");
        coll.add("C");
        coll.add("JavaScript");
        coll.add("Kotlin");
        coll.add("Swift");

        System.out.println("Elements in Collection: ");

        for(Object o : coll) {
            System.out.println(o);
        }

        System.out.println("Size of collection = " + coll.size());
        System.out.println("-----------------------------------------------------------");
        coll.add("PHP");

        System.out.println("After adding process, Size of collection = " + coll.size());

        System.out.println("-----------------------------------------------------------");

        coll.forEach(System.out::println);

        System.out.println("-----------------------------------------------------------");

        boolean b = coll.add("Carbon"); //add method return boolean type
        System.out.println("Is adding process is successful?   " + b);

        coll.forEach(System.out::println);
        System.out.println("-----------------------------------------------------------");

        Collection<Integer> hashset = new HashSet<>();
        hashset.add(1998);
        hashset.add(1970);
        hashset.add(1976);
        hashset.add(2000);
        hashset.add(2003);
        hashset.add(2016);

        System.out.println("Size of hashset  -> " + hashset.size());
        hashset.forEach(System.out::println);

        System.out.println("-----------------------------------------------------------");

        hashset.remove(1998);
        hashset.forEach(System.out::println);
        System.out.println("Size of hashset  -> " + hashset.size());

        System.out.println("-----------------------------------------------------------");

        hashset.removeIf(a -> a.equals(2003));
        Boolean a = hashset.removeIf(o -> o.equals(2008));
        System.out.println("Is the removing condition is achieved --> " + a);
        hashset.forEach(System.out::println);
        System.out.println("Size of hashset  -> " + hashset.size());

        System.out.println("-----------------------------------------------------------");
        System.out.println("Does collection includes 1970 ?   " + hashset.contains(1970));
        System.out.println("Does the collection includes arraylist collection ?   " + hashset.containsAll(coll));


        System.out.println("-----------------------------------------------------------");
        System.out.println("Collection to array");
        Object [] arr = hashset.toArray();
        System.out.println(arr[1]);
        System.out.println("Array:");
        for (Object o: arr) {
            System.out.println(o);
        }
        System.out.println("-----------------------------------------------------------");

        coll.addAll(hashset);
        coll.forEach(System.out::println);

        System.out.println("-----------------------------------------------------------");
        coll.removeAll(hashset);
        coll.forEach(System.out::println);
        System.out.println("-----------------------------------------------------------");

        coll.clear();
        coll.forEach(System.out::println);
















    }


}
