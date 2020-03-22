package ru.job4j.oop.fairytail;

public class BallStory {

    public static void main(String[] args) {

        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();

        if (hare.tryEat(ball)) {
            System.out.println("The End.");
            return;
        } else {
            ball.song();
        }
        if (wolf.tryEat(ball)) {
            System.out.println("The End.");
            return;
        } else {
            ball.song();
        }
        if (fox.tryEat(ball)) {
            System.out.println("The End.");
            return;
        } else {
            ball.song();
        }
    }
}
