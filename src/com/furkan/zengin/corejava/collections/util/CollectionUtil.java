package com.furkan.zengin.corejava.collections.util;

import java.io.ObjectStreamException;
import java.util.*;

public class CollectionUtil {

    private static Set<String> set;

    static {
        set = new HashSet<>();
        set.add("Java");
        set.add("JavaScript");
        set.add("C");
        set.add("C++");
        set.add("Python");
        set.add("DotNet");
        set.add("PHP");
    }

    public static Collection<String> getCollection() {
        return set;
    }

    public static Set getEmptySet() {
        return new TreeSet();
    }

    public static void listSet(Collection coll) {
        System.out.println("************************");
        System.out.println("Collection is listing");
        System.out.println("-------------------------");
        Iterator ite = coll.iterator();
        while (ite.hasNext()){
            System.out.println(ite.next());
        }
        System.out.println("-------------------------");
    }

    public static void listElements(List list) {
        System.out.println("************************");
        System.out.println("Elements in list");
        System.out.println("-------------------------");
        ListIterator i = list.listIterator();
        while (i.hasNext())
            System.out.println(i.nextIndex() + ": " + i.next());
        System.out.println("****************************************************\n");
    }

    public static void listElemets(Map<Object, Object> map) {
        System.out.println("************************");
        System.out.println("Elements in map");
        System.out.println("-------------------------");
        Set mapSet = map.keySet();
        Iterator iter = set.iterator();
        while (iter.hasNext()){
            Object key = iter.next();
            Object value = map.get(key);
            System.out.println(key + " -- " + value);
        }
        System.out.println("-------------------------");

    }
}
