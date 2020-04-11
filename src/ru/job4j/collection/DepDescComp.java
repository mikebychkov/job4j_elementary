package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] as1 = o1.split("/");
        String[] as2 = o2.split("/");
        int len = Math.min(as1.length, as2.length);
        int rsl = 0;
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                rsl = as2[i].compareTo(as1[i]);
            } else {
                rsl = as1[i].compareTo(as2[i]);
            }
            if (rsl != 0) break;
        }
        if (rsl == 0) rsl = as1.length - as2.length;
        return rsl;
    }
}
