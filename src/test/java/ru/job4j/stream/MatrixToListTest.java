package ru.job4j.stream;

import org.junit.Test;
import org.junit.Assert;
import org.hamcrest.core.Is;

import java.util.List;

public class MatrixToListTest {
    @Test
    public void test() {
        Integer[][] mx = {{1,2,3}, {4,5,6}, {7,8,9}};
        List<Integer> rsl = MatrixToList.convert(mx);
        List<Integer> exp = List.of(1,2,3,4,5,6,7,8,9);
        Assert.assertThat(rsl, Is.is(exp));
    }
}
