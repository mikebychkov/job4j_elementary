package ru.job4j.lambda;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Group {

    public static Map<String, Set<String>> sections(List<Student> students) {
        return students.stream().flatMap(
                st -> st.getUnits().stream().map(un -> new Holder(un, st.getName()))
        ).collect( // собираем карту
                Collectors.groupingBy(t -> t.key, // определяем группировку
                        Collector.of(
                                HashSet::new, // аккумулятор.
                                (set, el) -> set.add(el.value), // как добавлять данные.
                                (left, right) -> { left.addAll(right); return left; } // для агрегации.
                        )
                )
        );
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("James", Set.of("abc", "music", "cola")),
                new Student("Bond", Set.of("music", "whisky")),
                new Student("Philipp", Set.of("philosophy", "whisky"))
        );
        System.out.println(sections(students));
    }
}
