package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight() {
        double weight = Fit.manWeight(180);
        double expected = 90;
        Assert.assertEquals(expected, weight, 5);
    }

    @Test
    public void womanWeight() {
        double weight = Fit.womanWeight(170);
        double expected = 70;
        Assert.assertEquals(expected, weight, 5);
    }
}
