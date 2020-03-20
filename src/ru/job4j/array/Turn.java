package ru.job4j.array;

public class Turn {
    public static int[] backold(int[] array) {
        int dest = 0;
        int source = 0;
        for (int x = 0; x < array.length; x++) {
            source = x;
            dest = array.length - 1 - x;
            if (source < dest) {
                SwitchArray.swap(array, source, dest);
            } else {
                break;
            }
        }
        return array;
    }

    public static int[] back(int[] array) {
        int dest = 0;
        int source = 0;
        int len = array.length / 2;
        for (int x = 0; x < len; x++) {
            source = x;
            dest = array.length - 1 - x;
            SwitchArray.swap(array, source, dest);
        }
        return array;
    }
}
