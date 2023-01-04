package com.furkan.zengin.corejava.collections.list;

import java.util.Comparator;

public class GetListComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return Integer.compare(o1.toString().length(), o2.toString().length());
    }
}
