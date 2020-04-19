package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

    public static Map<String, Student> convert(List<Student> list) {
        /*
        return list.stream().distinct().collect(
                Collectors.toMap(
                        st -> st.getName(),
                        st -> st
                )
        );
        */
        return list.stream().collect(
                Collectors.toMap(
                        st -> st.getName(),
                        st -> st,
                        (a, b) -> a
                )
        );
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Nikolay"));
        list.add(new Student("Kopernik"));
        list.add(new Student("Kopernik"));
        Map<String, Student> map = convert(list);
        System.out.println(map);
    }
}
