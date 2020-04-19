package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean test = data[0];
        for (int x = 1; x < data.length; x++) {
            if (test != data[x]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
