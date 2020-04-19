package ru.job4j.stream.improvements;

import ru.job4j.stream.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IMPStreamAPI {

    public static List<Student> levelOf(List<Student> students, int bound) {
        List<Student> rsl = students.stream().flatMap(Stream::ofNullable).collect(Collectors.toList());
        rsl.sort((st1, st2) -> Integer.compare(st2.getScore(), st1.getScore()));
        rsl = rsl.stream().takeWhile(st -> st.getScore() > bound).collect(Collectors.toList());
        return rsl;
    }

    public static void main(String[] args) {
        Student st1 = new Student("Kianu", 99);
        Student st2 = new Student("Van Dam", 50);
        List<Student> list = Arrays.asList(st1, st2);
        List<Student> rsl = levelOf(list, 70);
        rsl.forEach(System.out::println);
    }
}
