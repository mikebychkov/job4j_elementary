package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void square() {
        double result = SqArea.square(6, 2);
        double expected = 2;
        Assert.assertEquals(expected, result, 0.01);
    }
}
