package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        double result = Point.distance(3, 3, 5, 7);
        double expected = 4.47;
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void distance2d() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(2, 1);
        double result = p2.distance(p1);
        Assert.assertEquals(1.41, result, 0.01);
    }

    @Test
    public void distance3d() {
        Point p1 = new Point(1, 2, 3);
        Point p2 = new Point(2, 1, 6);
        double result = p2.distance3d(p1);
        Assert.assertEquals(3.31, result, 0.01);
    }
}
