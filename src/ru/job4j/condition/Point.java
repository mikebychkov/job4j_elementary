package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
        rsl = Math.sqrt(rsl);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(1, 2, 2, 1);
        System.out.println("result (1, 2) to (2, 1) " + result);
        result = Point.distance(3, 3, 5, 7);
        System.out.println("result (3, 3) to (5, 7) " + result);
    }
}
