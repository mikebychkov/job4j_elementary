package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int x = start + 1; x <= finish; x++) {
            min = Math.min(min, array[x]);
        }
        return min;
    }
}
