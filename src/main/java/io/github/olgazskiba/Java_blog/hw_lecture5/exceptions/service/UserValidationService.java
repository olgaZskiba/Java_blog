package io.github.olgazskiba.Java_blog.hw_lecture5.exceptions.service;

/*
Класс UserValidationService - состоит из метода, который выполняет проверку пользователя
в соответствии со следующими правилами:

Минимальная длина имени / фамилии пользователя - 3 символа;
Максимальная длина имени / фамилии пользователя - 15 символов;
Допустимый возраст пользователя: от 0 до 120 лет включительно;
В случае, если данные не проходят одну из проверок,
то необходимо выбросить UserValidationException с причиной ошибки.
 */

import io.github.olgazskiba.Java_blog.hw_lecture5.exceptions.been.User;
import org.apache.log4j.Logger;

public class UserValidationService {

    Logger log = Logger.getLogger(UserValidationService.class);

    private User user;

    public UserValidationService(User user) {
        this.user = user;
    }

    public void checkFirstName(String name) throws UserValidationException {
        if (name.length() >= 3 && name.length() <= 15) {
            user.setFirstName(name);
        } else {
            log.info("Length of Firstname is invalid");
            throw new UserValidationException("Length of Firstname is invalid");
        }
    }

    public void checkLastName(String lastName) throws UserValidationException {
        if (lastName.length() >= 3 && lastName.length() <= 15) {
            user.setLastName(lastName);
        } else {
            log.info("Length of Lastname is invalid");
            throw new UserValidationException("Length of Lastname is invalid");
        }
    }

    public void checkAge(int age) throws UserValidationException {
        if (age > 0 && age <= 120) {
            user.setAge(age);
        } else {
            log.info("Age is invalid");
            throw new UserValidationException("Age is invalid");
        }
    }

}
