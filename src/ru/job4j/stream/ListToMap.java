package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Nikolay"));
        list.add(new Student("Kopernik"));
        Map<String, Student> map = list.stream().distinct().collect(
                Collectors.toMap(
                        st -> st.getName(),
                        st -> st
                )
        );
        System.out.println(map);
    }
}
