package ru.job4j.ex;

/*
java.lang.Exception - Проверяемые исключения (обязаны быть обработаны - extends, try)
java.lang.RuntimeException - Непроверяемые исключения
*/

public class UserInputException extends Exception {
    public UserInputException(String message) {
        super(message);
    }
}
