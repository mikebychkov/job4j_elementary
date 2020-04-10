package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int len = Math.max(left.length(), right.length());
        if (left.length() > right.length()) {
            for (int i = 0; i < len - right.length(); i++) {
                right += " ";
            }
        } else {
            for (int i = 0; i < len - left.length(); i++) {
                left += " ";
            }
        }
        int rsl = 0;
        for (int i = 0; i < len; i++) {
            rsl = left.charAt(i) - right.charAt(i);
            if (rsl != 0) break;
        }
        return rsl;
    }
}
