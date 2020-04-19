package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 11;
        boolean firstPlayer = true;
        String playerName = "";
        while (count > 0) {
            playerName = "Player " + (firstPlayer ? 1 : 2);
            System.out.println(playerName);
            System.out.println("Count: " + count);
            int value = Integer.valueOf(input.nextLine());
            if (value > 0 && value < 4) {
                count -= value;
                firstPlayer = !firstPlayer;
            } else {
                System.out.println("You can take from 1 to 3 matches! Try again!");
            }
        }
        System.out.println("You win: " + playerName + "!");
    }
}
