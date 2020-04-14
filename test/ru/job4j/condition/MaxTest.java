package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax5To3Then5() {
        int result = Max.max(5, 3);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax10To10Then10() {
        int result = Max.max(10, 10);
        assertThat(result, is(10));
    }

    @Test
    public void whenMax3Param() {
        int result = Max.max(7, 10, 17);
        assertThat(result, is(17));
    }

    @Test
    public void whenMax4Param() {
        int result = Max.max(2, 10, 10, 15);
        assertThat(result, is(15));
    }
}
