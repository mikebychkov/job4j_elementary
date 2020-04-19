package ru.job4j.oop.animals;

public class Tiger extends Predator {

    public Tiger(String name) {
        super(name);
        System.out.println("class Tiger");
    }

    public static void main(String[] args) {
        Tiger tig = new Tiger("Usuriyskiy");
        System.out.println(tig.getName());
    }
}
