package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ListToMapTest {
    @Test
    public void test() {
        Student st1 = new Student("Nikolay");
        Student st2 = new Student("Kopernik");

        List<Student> list = Arrays.asList(st1, st2);

        Map<String, Student> rsl = ListToMap.convert(list);
        Map<String, Student> exp = Map.of(st2.getName(), st2, st1.getName(), st1);

        assertThat(rsl, is(exp));
    }
}
