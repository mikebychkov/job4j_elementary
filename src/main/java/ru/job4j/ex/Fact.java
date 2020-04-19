package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {
        Fact f = new Fact();
        f.calc(-1);
    }

    public int calc(int n) {
        if (n < 0) {
            throw new java.lang.IllegalArgumentException("Argument shouldn't be less then zero!");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
