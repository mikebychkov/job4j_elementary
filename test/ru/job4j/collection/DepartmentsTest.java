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
        List<String> list = new ArrayList<>(
                List.of(
                        "K1/SK1",
                        "K1/SK2",
                        "K1/SK1/SSK1",
                        "K1/SK1/SSK2",
                        "K2",
                        "K2/SK1/SSK1",
                        "K2/SK1/SSK2"
                )
        );

        list = Departments.fillGaps(list);

        List<String> exp = new ArrayList<>(
                List.of(
                        "K1",
                        "K1/SK1",
                        "K1/SK1/SSK1",
                        "K1/SK1/SSK2",
                        "K1/SK2",
                        "K2",
                        "K2/SK1",
                        "K2/SK1/SSK1",
                        "K2/SK1/SSK2"
                )
        );

        assertThat(list, is(exp));
    }

    @Test
    public void test2_Fill_Desc() {
        List<String> list = new ArrayList<>(
                List.of(
                        "K1/SK1",
                        "K1/SK2",
                        "K1/SK1/SSK1",
                        "K1/SK1/SSK2",
                        "K2",
                        "K2/SK1/SSK1",
                        "K2/SK1/SSK2"
                )
        );

        list = Departments.fillGaps(list);
        Departments.sortDesc(list);

        List<String> exp = new ArrayList<>(
                List.of(
                        "K2",
                        "K2/SK1",
                        "K2/SK1/SSK1",
                        "K2/SK1/SSK2",
                        "K1",
                        "K1/SK1",
                        "K1/SK1/SSK1",
                        "K1/SK1/SSK2",
                        "K1/SK2"
                )
        );

        assertThat(list, is(exp));
    }
}
