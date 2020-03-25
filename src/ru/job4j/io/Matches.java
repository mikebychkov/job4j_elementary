package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 11;
        while (count > 0) {
            System.out.println("Count: " + count);
            int value = Integer.valueOf(input.nextLine());
            count -= value;
        }
        System.out.println("You win!");
    }
}
