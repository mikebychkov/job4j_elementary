package ru.job4j.stream;

public class Student {
    private int score = 0;
    private String name = "";

    public Student(int score) {
        this.score = score;
    }

    public Student(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
