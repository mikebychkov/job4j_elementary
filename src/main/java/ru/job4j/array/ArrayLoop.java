package ru.job4j.array;

public class ArrayLoop {

    public static void main(String[] args) {
        int[] arrint = new int[5];
        for (int x = 0; x < arrint.length; x++) {
            arrint[x] = x * 2 + 3;
        }
        for (int x = 0; x < arrint.length; x++) {
            System.out.println(arrint[x]);
        }
    }
}
