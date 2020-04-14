package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] as1 = o1.split("/");
        String[] as2 = o2.split("/");
        int rsl = as2[0].compareTo(as1[0]);
        if (rsl != 0) return rsl;
        return o1.compareTo(o2);
    }
}
