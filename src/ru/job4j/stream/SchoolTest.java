package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {

    @Test
    public void testA() {
        Student st77 = new Student(77);
        Student st90 = new Student(90);
        Student st57 = new Student(57);
        Student st44 = new Student(44);
        Student st63 = new Student(63);
        List<Student> studens = Arrays.asList(st77, st90, st57, st44, st63);
        School sc = new School();
        List<Student> rsl = sc.collect(studens, st -> st.getScore() >= 70);
        List<Student> exp = Arrays.asList(st77, st90);
        assertThat(rsl, is(exp));
    }

    @Test
    public void testB() {
        Student st77 = new Student(77);
        Student st90 = new Student(90);
        Student st57 = new Student(57);
        Student st44 = new Student(44);
        Student st63 = new Student(63);
        List<Student> studens = Arrays.asList(st77, st90, st57, st44, st63);
        School sc = new School();
        List<Student> rsl = sc.collect(studens, st -> st.getScore() >= 50 && st.getScore() < 70);
        List<Student> exp = Arrays.asList(st57, st63);
        assertThat(rsl, is(exp));
    }

    @Test
    public void testC() {
        Student st77 = new Student(77);
        Student st90 = new Student(90);
        Student st57 = new Student(57);
        Student st44 = new Student(44);
        Student st63 = new Student(63);
        List<Student> studens = Arrays.asList(st77, st90, st57, st44, st63);
        School sc = new School();
        List<Student> rsl = sc.collect(studens, st -> st.getScore() < 50);
        List<Student> exp = Arrays.asList(st44);
        assertThat(rsl, is(exp));
    }
}
