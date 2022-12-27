package com.furkan.zengin.corejava.collections.interfaces;

import java.io.ObjectStreamException;
import java.util.Arrays;

public class ComparableExample1 implements Comparable<ComparableExample1>{

    private String name;
    private int age;

    public ComparableExample1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + ' ' +  age;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(ComparableExample1 o) {
        if(this.age != (o.age))
            return this.age - o.age;
        else
            return o.getName().compareTo(this.getName());
    }

}

class Main{

    public static void main(String[] args) {

        ComparableExample1 []arr = {new ComparableExample1("Furkan Zengin", 24), new ComparableExample1("Tarık Zengin", 19)
        , new ComparableExample1("İsmet Zengin", 19), new ComparableExample1("Beyza Zengin", 8)};

         for(ComparableExample1 c : arr) {
             System.out.println(c);
         }


        Arrays.sort(arr);
        System.out.println("------------------------------------------------------------");
         for(ComparableExample1 c : arr){
             System.out.println(c);
         }



    }

}
