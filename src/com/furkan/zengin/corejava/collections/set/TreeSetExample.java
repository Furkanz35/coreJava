package com.furkan.zengin.corejava.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample<S> {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(123);
        treeSet.add(213);
        treeSet.add(1);
        treeSet.add(1231);
        treeSet.add(123432);
        treeSet.add(421);
        treeSet.add(992);

        System.out.println(treeSet.size());
        System.out.println(treeSet);
        treeSet.forEach(System.out::println);

        System.out.println("********************************");
        System.out.println(treeSet.floor(32143));
        System.out.println(treeSet.ceiling(932));
        System.out.println("********************************");

        treeSet.forEach(System.out::println);
        TreeSet reversetreeset = (TreeSet)treeSet.descendingSet();
        System.out.println("********************************");
        reversetreeset.forEach(System.out::println);
    }
}
