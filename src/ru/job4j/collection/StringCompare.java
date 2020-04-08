package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int len = Math.max(left.length(), right.length());
        int rsl = 0;
        for (int i = 0; i < len; i++) {
            rsl = charAt(left, i) - charAt(right, i);
            if (rsl != 0) break;
        }
        return rsl;
    }

    private int charAt(String word, int index) {
        try {
            return word.charAt(index);
        } catch (StringIndexOutOfBoundsException e) {
            return -1000;
        }
    }
}
