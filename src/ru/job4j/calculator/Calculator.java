package ru.job4j.calculator;

/**
 * Класс Calculator предназначен для тестирования арифметических операций
 * @author Mike.Bychkov
 */
public class Calculator {
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int onePlusTwo = one + two;
        System.out.println(onePlusTwo);
        int six = 6;
        int sixDivTwo = six / two;
        System.out.println(sixDivTwo);
        int five = 5;
        int fiveMinusTwo = five - two;
        System.out.println(fiveMinusTwo);
        int four = 4;
        int fourTimeTwo = four * two;
        System.out.println(fourTimeTwo);
        int size = 10;
        size = 100;
        size -= 5;
        System.out.println(size);
    }
}
