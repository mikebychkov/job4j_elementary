package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }
    // 1
    @Test
    public void whenSort1() {
        int[] input = new int[] {3, 1, 2};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3};
        assertThat(result, is(expect));
    }
    // 2
    @Test
    public void whenSort2() {
        int[] input = new int[] {13, 7, 17, 9, 11};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {7, 9, 11, 13, 17};
        assertThat(result, is(expect));
    }
}
