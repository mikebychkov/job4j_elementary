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
}
