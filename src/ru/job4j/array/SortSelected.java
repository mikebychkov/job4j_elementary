package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        int start = 0;
        int min = 0;
        int index = 0;
        while (start < data.length) {
            min = MinDiapason.findMin(data, start, data.length);
            index = FindLoop.indexOf(data, min, start, data.length);
            SwitchArray.swap(data, start, index);
            start++;
        }
        return data;
    }
}
