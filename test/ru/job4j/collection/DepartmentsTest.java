package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DepartmentsTest {
    @Test
    public void whenMissed() {
        List<String> input = Arrays.asList("k1/sk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenNonChange() {
        List<String> input = Arrays.asList("k1", "k1/sk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void test1_Fill_Asc() {
        List<String> list = new ArrayList<>();
        list.add("K1/SK1");
        list.add("K1/SK2");
        list.add("K1/SK1/SSK1");
        list.add("K1/SK1/SSK2");
        list.add("K2");
        list.add("K2/SK1/SSK1");
        list.add("K2/SK1/SSK2");

        list = Departments.fillGaps(list);

        List<String> exp = new ArrayList<>();
        exp.add("K1");
        exp.add("K1/SK1");
        exp.add("K1/SK1/SSK1");
        exp.add("K1/SK1/SSK2");
        exp.add("K1/SK2");
        exp.add("K2");
        exp.add("K2/SK1");
        exp.add("K2/SK1/SSK1");
        exp.add("K2/SK1/SSK2");

        assertThat(list, is(exp));
    }

    @Test
    public void test2_Fill_Desc() {
        List<String> list = new ArrayList<>();
        list.add("K1/SK1");
        list.add("K1/SK2");
        list.add("K1/SK1/SSK1");
        list.add("K1/SK1/SSK2");
        list.add("K2");
        list.add("K2/SK1/SSK1");
        list.add("K2/SK1/SSK2");

        list = Departments.fillGaps(list);
        Departments.sortDesc(list);

        List<String> exp = new ArrayList<>();
        exp.add("K2");
        exp.add("K2/SK1");
        exp.add("K2/SK1/SSK1");
        exp.add("K2/SK1/SSK2");
        exp.add("K1");
        exp.add("K1/SK1");
        exp.add("K1/SK1/SSK1");
        exp.add("K1/SK1/SSK2");
        exp.add("K1/SK2");

        assertThat(list, is(exp));
    }
}
