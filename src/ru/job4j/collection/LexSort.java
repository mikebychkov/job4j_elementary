package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] la = left.replace(".", ",").split(",");
        String[] ra = right.replace(".", ",").split(",");
        int len = Math.max(la.length, ra.length);
        int rsl = 0;
        for (int i = 0; i < len; i++) {
            rsl = toInt(la[i]) - toInt(ra[i]);
            if (rsl != 0) return rsl;
        }
        return rsl;
    }

    private int toInt(String val) {
        try {
            return Integer.parseInt(val);
        } catch (Exception e) {
            return -1000;
        }
    }

    public static void main(String[] args) {
        String w1 = "1.2. left";
        String w2 = "1.2.2. right";
        LexSort so = new LexSort();
        System.out.println(so.compare(w1, w2));
    }
}
