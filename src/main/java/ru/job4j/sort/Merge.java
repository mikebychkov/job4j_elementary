package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int il = 0;
        int ir = 0;
        while ((il + ir) < rsl.length) {
            if (il < left.length && ir < right.length) {
                if (left[il] < right[ir]) {
                    rsl[il + ir] = left[il];
                    il++;
                } else {
                    rsl[il + ir] = right[ir];
                    ir++;
                }
            } else {
                for (int x = il; x < left.length; x++) {
                    rsl[il + ir] = left[x];
                    il++;
                }
                for (int x = ir; x < right.length; x++) {
                    rsl[il + ir] = right[x];
                    ir++;
                }
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
