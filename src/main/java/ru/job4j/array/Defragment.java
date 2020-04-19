package ru.job4j.array;

public class Defragment {
    public static String[] compressold(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                for (int x = index + 1; x < array.length; x++) {
                    if (array[x] != null) {
                        swap(array, index, x);
                        break;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int x = index;
                while (x < array.length) {
                    if (array[x] != null) {
                        swap(array, index, x);
                        break;
                    }
                    x++;
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static String[] swap(String[] array, int x, int y) {
        int source = Math.min(x, array.length - 1);
        source = Math.max(source, 0);
        int dest = Math.min(y, array.length - 1);
        dest = Math.max(dest, 0);
        if (source != dest) {
            String temp = array[source];
            array[source] = array[dest];
            array[dest] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
