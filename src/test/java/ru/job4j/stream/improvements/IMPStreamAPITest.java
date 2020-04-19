package ru.job4j.stream.improvements;

import org.junit.Test;
import org.junit.Assert;
import org.hamcrest.core.Is;

import ru.job4j.stream.Student;

import java.util.Arrays;
import java.util.List;

public class IMPStreamAPITest {

    @Test
    public void test() {
        Student st1 = new Student("Kianu", 99);
        Student st2 = new Student("Van Dam", 50);
        List<Student> list = Arrays.asList(st1, st2);
        List<Student> rsl = IMPStreamAPI.levelOf(list, 70);
        List<Student> exp = Arrays.asList(st1);
        Assert.assertThat(rsl, Is.is(exp));
    }
}
