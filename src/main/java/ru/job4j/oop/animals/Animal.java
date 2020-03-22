package ru.job4j.oop.animals;

public class Animal {

    private String name;

    public Animal() {
        super();
        System.out.println("class Animal");
    }

    public Animal(String name) {
        super();
        this.name = name;
        System.out.println("class Animal");
    }

    public String getName() {
        return this.name;
    }
}
