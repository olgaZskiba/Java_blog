package io.github.olgazskiba.Java_blog.hw_lecture5.exceptions.service;

/*
Класс UserValidationException - непроверяемое исключение (Unchecked / RuntimeException).
Содержит сообщение с причиной ошибки.
 */

public class UserValidationException extends RuntimeException {

    public UserValidationException(String message) {

        super("UserValidationException: " + message);
    }
}
