package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MatrixToList {

    public static List<Integer> convert(Integer[][] mx) {
        return Arrays.stream(mx).flatMap(x -> Arrays.stream(x)).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Integer[][] mx = {{1,2,3}, {4,5,6}, {7,8,9}};
        List<Integer> rsl = convert(mx);
        System.out.println(rsl);
    }
}
