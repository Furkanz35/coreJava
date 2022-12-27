package com.furkan.zengin.corejava.collections.interfaces;

import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) throws InterruptedException {
        Integer i5 = 5;
        Integer i7 = 7;

        System.out.println("Compare 5 to 7: " + i5.compareTo(i7));
        System.out.println("Compare 7 to 5: " + i7.compareTo(i5));
        System.out.println("Compare 5 to 5: " + i5.compareTo(i5));

        System.out.println();

        Character c1 = 'J';
        Character c2 = 'C';
        System.out.println("Compare 'J' to 'C': " + c1.compareTo(c2));
        System.out.println("Compare 'C' to 'J': " + c2.compareTo(c1));

        System.out.println();

        Boolean b1 = false;
        Boolean b2 = true;
        System.out.println("Compare false to true: " + b1.compareTo(b2));
        System.out.println("Compare true to false: " + b2.compareTo(b1));

        System.out.println();

        String s1 = "Java";
        String s2 = "C++";
        System.out.println("Compare \"Java\" to \"C++\": " + s1.compareTo(s2));
        System.out.println("Compare \"C++\" to \"Java\": " + s2.compareTo(s1));

        System.out.println();

        Date date1 = new Date();
        Thread.currentThread().sleep(100);
        Date date2 = new Date();
        System.out.println("Compare date1 to date2: " + date1.compareTo(date2));
        System.out.println("Compare date2 to date1: " + date2.compareTo(date1));

        System.out.println();

    }
}
