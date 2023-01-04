package com.furkan.zengin.corejava.collections.list;

import java.sql.SQLOutput;
import java.util.List;
import java.util.ListIterator;

import com.furkan.zengin.corejava.collections.util.CollectionUtil;
import com.furkan.zengin.corejava.collections.list.GetListComparator;
public class ListExample {
    public static void main(String[] args) {
        List list = CollectionUtil.getList();
        System.out.println("Elements in list");
        System.out.println("---------------------");
        list.forEach(System.out::println);

        System.out.println("---------Sorting process---------");
        list.sort(new GetListComparator());
        list.forEach(System.out::println);

        System.out.println("-----------------------------");

        list.add("End of the person");
        list.add(0, "Start of the person");
        list.forEach(System.out::println);

        System.out.println("----------------------------");
        System.out.println("Does the list contains Furkan? -->  " + list.contains("Furkan"));
        System.out.println(list.indexOf("Furkan"));
        list.set(list.indexOf("Furkan"), "Marcus");
        list.forEach(System.out::println);

        System.out.println("\nIterating forward through a list iterator:");
        ListIterator listIter = list.listIterator();
        while (listIter.hasNext()) {
            System.out.println(listIter.nextIndex() + ": " + listIter.next());
        }

        System.out.println("\nIterating backward through a list iterator:");
        while (listIter.hasPrevious()) {
            System.out.println(listIter.previousIndex() + ": " + listIter.previous());
        }

        System.out.println("\nProcessing the list while iterating forward through a list iterator:");
        listIter = list.listIterator();
        listIter.add("11");
        while (listIter.hasNext()) {
            listIter.add("* * *");
            if (listIter.next().equals("Marcus"))
                listIter.set("Selim");
        }
        listIter.add("* * *");
        listIter.add("22");
        list.forEach(System.out::println);
    }
}
