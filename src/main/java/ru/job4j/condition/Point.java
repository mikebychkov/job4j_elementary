package ru.job4j.condition;

public class Point {

    private int x;
    private int y;
    private int z;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
        rsl = Math.sqrt(rsl);
        return rsl;
    }

    public static double distance(Point p1, Point p2) {
        double rsl = Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2);
        rsl = Math.sqrt(rsl);
        return rsl;
    }

    public double distance(Point that) {
        double rsl = Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2);
        rsl = Math.sqrt(rsl);
        return rsl;
    }

    public double distance3d(Point that) {
        double rsl = Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2) + Math.pow(this.z - that.z, 2);
        rsl = Math.sqrt(rsl);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(1, 2, 2, 1);
        System.out.println("result (1, 2) to (2, 1) " + result);
        result = Point.distance(3, 3, 5, 7);
        System.out.println("result (3, 3) to (5, 7) " + result);

        // oop

        Point p1 = new Point(1, 2);
        Point p2 = new Point(2, 1);
        Point p3 = new Point(3, 3);
        Point p4 = new Point(5, 7);
        Point p5 = new Point(1, 2, 3);
        Point p6 = new Point(2, 1, 6);

        // oop 1

        result = Point.distance(p1, p2);
        System.out.println("oop result (1, 2) to (2, 1) " + result);

        result = Point.distance(p3, p4);
        System.out.println("oop result (3, 3) to (5, 7) " + result);

        // oop 2

        result = p2.distance(p1);
        System.out.println("oop result (1, 2) to (2, 1) " + result);

        result = p4.distance(p3);
        System.out.println("oop result (3, 3) to (5, 7) " + result);

        // oop 3

        result = p6.distance3d(p5);
        System.out.println("oop result (1, 2, 3) to (2, 1, 6) " + result);
    }
}
