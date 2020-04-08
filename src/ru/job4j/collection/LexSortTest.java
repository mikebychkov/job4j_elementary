package ru.job4j.collection;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;

import java.util.Arrays;

public class LexSortTest {
    @Test
    public void sortNum1and2and10() {
        String[] input = {
                "10. Task.",
                "1. Task.",
                "2. Task."
        };
        String[] out = {
                "1. Task.",
                "2. Task.",
                "10. Task."
        };
        Arrays.sort(input, new LexSort());
        assertThat(input, is(out));
    }

    @Test
    public void test1() {
        String[] input = {
                "10.2.2. Task.",
                "10.2. Task.",
                "2.1.1. Task."
        };
        String[] out = {
                "2.1.1. Task.",
                "10.2. Task.",
                "10.2.2. Task."
        };
        Arrays.sort(input, new LexSort());
        assertThat(input, is(out));
    }
}
