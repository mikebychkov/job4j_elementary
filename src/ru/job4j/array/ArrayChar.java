package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        int len = Math.min(word.length, pref.length);
        for (int x = 0; x < len; x++) {
            if (word[x] != pref[x]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
