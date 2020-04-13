package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] as1 = o1.split("/");
        String[] as2 = o2.split("/");
        int len = Math.min(as1.length, as2.length);
        int rsl = 0;
        rsl = as2[0].compareTo(as1[0]);
        if (rsl != 0) return rsl;
        for (int i = 1; i < len; i++) {
            rsl = as1[i].compareTo(as2[i]);
            if (rsl != 0) return rsl;
        }
        rsl = as1.length - as2.length;
        return rsl;
    }
}
