package com.furkan.zengin.corejava.collections.interfaces;

import java.util.ArrayList;
import java.util.Collections;

public class Comparator{

    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList<Student>();

        // Adding entries in above List
        // using add() method
        ar.add(new Student(111, "Mayank", "london"));
        ar.add(new Student(131, "Anshul", "nyc"));
        ar.add(new Student(121, "Solanki", "jaipur"));
        ar.add(new Student(101, "Aggarwal", "Hongkong"));

        // Display message on console for better readability
        System.out.println("Unsorted");

        // Iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        // Sorting student entries by roll number
        Collections.sort(ar, new SortByRoll());

        // Display message on console for better readability
        System.out.println("\nSorted by rollno");

        // Again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        // Sorting student entries by name
        Collections.sort(ar, new SortByName());

        // Display message on console for better readability
        System.out.println("\nSorted by name");

        // // Again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

    }


}

class Student {

    int rollno;
    String name, adress;

    @Override
    public String toString() {
        return rollno + "  "  + name + "  " + adress ;
    }

    public Student(int rollno, String name, String adress) {
        this.rollno = rollno;
        this.name = name;
        this.adress = adress;
    }
}


class SortByName implements java.util.Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

class SortByRoll implements java.util.Comparator<Student> {
    @Override
    public int compare(Student a, Student b)
    {

        return a.rollno - b.rollno;
    }
}
