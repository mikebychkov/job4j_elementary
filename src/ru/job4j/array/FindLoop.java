package ru.job4j.array;

public class FindLoop {
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int x = 0; x < data.length; x++) {
            if (data[x] == el) {
                rst = x;
                break;
            }
        }
        return rst;
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        start = Math.max(start, 0);
        finish = Math.max(finish, 0);
        start = Math.min(start, data.length - 1);
        finish = Math.min(finish, data.length - 1);
        for (int x = start; x <= finish; x++) {
            if (data[x] == el) {
                rst = x;
                break;
            }
        }
        return rst;
    }
}

