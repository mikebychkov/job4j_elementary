package ru.job4j.stream;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private int score = 0;
    private String name = "";

    public Student(int score) {
        this.score = score;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int score) {
        this.score = score;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return score == student.score &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, name);
    }

    @Override
    public int compareTo(Student o) {
        int rsl = this.name.compareTo(o.name);
        if (rsl == 0) rsl = Integer.compare(this.score, o.score);
        return rsl;
    }
}
