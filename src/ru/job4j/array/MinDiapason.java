package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        start = Math.max(start, 0);
        finish = Math.max(finish, 0);
        start = Math.min(start, array.length - 1);
        finish = Math.min(finish, array.length - 1);
        int min = array[start];
        for (int x = start + 1; x <= finish; x++) {
            min = Math.min(min, array[x]);
        }
        return min;
    }
}
