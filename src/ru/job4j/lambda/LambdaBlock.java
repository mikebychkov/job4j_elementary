package ru.job4j.lambda;

import java.util.Comparator;

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
    }
}
