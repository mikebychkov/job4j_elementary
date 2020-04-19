package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");

        String question = input.nextLine();
        int answer = rand.nextInt(3);

        switch (answer) {
            case 0 : System.out.print("Да"); break;
            case 1 : System.out.print("Нет"); break;
            default: System.out.print("Может быть"); break;
        }
    }
}
