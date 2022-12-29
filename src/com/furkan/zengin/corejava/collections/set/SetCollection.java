package com.furkan.zengin.corejava.collections.set;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetCollection {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        String [] arr = {"Java", "C++", "C", "Javascript", "Kotlin", "Swift", "C++", "PHP", "Java", "C", "C Sharp"};
        System.out.println("---------------------------------------");

        for(int i = 0; i < arr.length; ++i) {
            if(set.add(arr[i])) {
                System.out.println();
                System.out.println(i + ". element of array");
                System.out.println("Adding is successful");
                System.out.println(arr[i]);
                System.out.println();
            }
            else {
                System.out.println();
                System.out.println(i + ". element of array");
                System.out.println(arr[i] + " is not tried for first time, couldnt add the set againg");
                System.out.println();

            }
        }

        System.out.println("---------------------------------------");
        set.forEach(System.out::println);
    }

}
