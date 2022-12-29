package com.furkan.zengin.corejava.collections.set;

import java.util.*;
import java.util.TreeSet;

//while adding element, tree set sorts the element in the set
public class NavigableAndSortedSetExample {
    public static void main(String[] args) {
        Set set = new TreeSet();
        //Java", "C++", "C", "Javascript", "Kotlin", "Swift", "C++", "PHP", "Java", "C", "C Sharp"
        System.out.println("Adding status");
        System.out.println("--------------------------");
        System.out.println("Java --> " + set.add("Java"));
        System.out.println("C --> " +set.add("C"));
        System.out.println("C++ --> " +set.add("C++"));
        System.out.println("Javascript --> " +set.add("Javascript"));
        System.out.println("Kotlin --> " +set.add("Kotlin"));
        System.out.println("PHP --> " +set.add("PHP"));
        System.out.println("Swift --> " +set.add("Swift"));
        System.out.println("C++ --> " +set.add("C++"));

        System.out.println("--------------------------");
        set.forEach(System.out::println);

        System.out.println("--------------------------");
        sortedSetProperties((SortedSet<String>) set);

    }

    public static void sortedSetProperties(SortedSet<String> set) {
        System.out.println("\nSortedSet Interface Functionalities");
        System.out.println("First" + " " + set.first());
        System.out.println("Last" + " " + set.last());
        Comparator comparator = set.comparator();
        if (comparator != null)
            System.out.println(comparator.getClass().getName());
        else
            System.out.println("Comparator is null");

        System.out.println("\n\n\n");
        System.out.println("Subset");
        SortedSet<String> subset = set.subSet("Java","Swift");
        Iterator<String> itersubset = subset.iterator();
        while (itersubset.hasNext())
            System.out.println(itersubset.next());

        System.out.println("**************\nHeadset \n***********");

        TreeSet headSet = (TreeSet)set.headSet("Java");
        itersubset = headSet.iterator();
        while (itersubset.hasNext())
            System.out.println(itersubset.next());
    }

}
