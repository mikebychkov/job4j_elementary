package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class LambdaBlock {

    public static void main(String[] args) {
        // lambda
        Comparator<String> cmpText = (left, right) -> left.compareTo(right);
        Comparator<String> cmpDescSize = (left, right) -> right.length() - left.length();
        // lambda block
        Comparator<String> cmpText2 = (left, right) -> {
            System.out.println("compare: " + left + " to " + right);
            return left.compareTo(right);
        };
        Comparator<String> cmpDescSize2 = (left, right) -> {
            System.out.println("compare: " + left.length() + " to " + right.length());
            return right.length() - left.length();
        };
        //
        List<String> names = Arrays.asList("Petr", "Nick", "Ban");
        //
        Consumer<String> consumer = (name) -> System.out.println(name);
        names.forEach(consumer);
        //
        String[] last = new String[1];
        names.forEach(
                n -> last[0] = n
        );
        System.out.println(last[0]);
    }
}
