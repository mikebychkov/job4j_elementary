package ru.job4j.array;

public class BarleyBreak {

    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int i = 1;
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                arr[x][y] = i++;
            }
        }
    }
}
