package ru.job4j.ex;

/*
java.lang.Exception - Проверяемые исключения (обязаны быть обработаны - extends, try)
java.lang.RuntimeException - Непроверяемые исключения
*/

public class ElementNotFoundException extends Exception {
    public ElementNotFoundException(String message) {
        super(message);
    }
}
