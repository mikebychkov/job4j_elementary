package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class LambdaDiapasonTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        //List<Double> result = function.diapason(5, 8, x -> 2 * Double.valueOf(x) + 1);
        List<Double> result = LambdaDiapason.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void squareFunction() {
        List<Double> result = LambdaDiapason.diapason(5, 8, x -> Math.pow(x, 2));
        List<Double> expected = Arrays.asList(25D, 36D, 49D);
        assertThat(result, is(expected));
    }

    @Test
    public void powFunction() {
        List<Double> result = LambdaDiapason.diapason(5, 8, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(32D, 64D, 128D);
        assertThat(result, is(expected));
    }
}
