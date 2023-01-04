package com.furkan.zengin.corejava.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Arraylist {

    public static void main(String[] args) {

        ArrayList<String> arrlist = new ArrayList<>(List.of("Java", "C++", "C", "Python",  "Kotlin"));
        for(String s : arrlist) {
            System.out.println(s);
        }

        arrlist.add("Swift");

        for(String s : arrlist) {
            System.out.println(s);
        }


        List<Integer> intlist = List.of(1, 2, 3, 4, 5, 6);
        Iterator<Integer> iterator = intlist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
//        intlist.add(213);

    ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("Furkan", "Tarık", "İsmet", "Beyza"));
        System.out.println(stringArrayList);
        stringArrayList.add("Ayse");
        System.out.println(stringArrayList);

        String[] strArray = stringArrayList.toArray(new String[0]);
        System.out.println(Arrays.toString(strArray));

    }

}
