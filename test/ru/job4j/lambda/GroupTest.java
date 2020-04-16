package ru.job4j.lambda;

import org.junit.Test;
import org.junit.Assert;
import org.hamcrest.core.Is;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GroupTest {

    @Test
    public void test() {
        List<Student> students = Arrays.asList(
                new Student("James", Set.of("abc", "music", "cola")),
                new Student("Bond", Set.of("music", "whisky")),
                new Student("Philipp", Set.of("philosophy", "whisky"))
        );
        Set<String> exp = Set.of("James", "Bond");
        Map<String, Set<String>> rsl = Group.sections(students);
        Assert.assertThat(rsl.get("music"), Is.is(exp));
    }
}
