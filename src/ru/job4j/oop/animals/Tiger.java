package ru.job4j.oop.animals;

public class Tiger extends Predator {

    public Tiger() {
        super();
        System.out.println("class Tiger");
    }

    public static void main(String[] args) {
        Tiger tig = new Tiger();
    }
}
