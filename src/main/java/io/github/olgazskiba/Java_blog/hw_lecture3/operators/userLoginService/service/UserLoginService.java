package io.github.olgazskiba.Java_blog.hw_lecture3.operators.userLoginService.service;

/*
Класс UserLoginService должен представлять сервис для выполнения логики со сравнением
и обладать следующими характеристиками:

Методы

Операция для входа в учетную запись boolean login(User user, String password).
Метод должен возвращать true если введеный пароль совпадает с паролем пользователя, а также
сбрасывать кол-во попыток на вход, если пользователь не заблокирован.
Метод должен возвращать false если пароли не совпадают, а также
уменьшить кол-во попыток на вход и заблокировать пользователя, если кол-во попыток исчерпано.
 */

import io.github.olgazskiba.Java_blog.hw_lecture3.operators.userLoginService.been.User;

public class UserLoginService {

    public boolean login(User user, String userInput) {
        if (!user.isBlocked()) {
            boolean result = checkUserPassword(user, userInput);
            updateUserStatus(user, result);
            return result;
        }
        return false;
    }

    private void updateUserStatus(User user, boolean result) {
        if (result) {
            restoreAttempts(user);
        } else {
            reduceLoginAttempts(user);
            blockIfLoginAttemptExeeded(user);
        }
    }

    private void blockIfLoginAttemptExeeded(User user) {
        if (user.getLoginAttempts() == 0) {
            blockUser(user);
        }
    }

    private boolean checkUserPassword(User user, String userInput) {
        return user.getPassword().equals(userInput);
    }

    private void reduceLoginAttempts(User user) {
        user.setLoginAttempts(user.getLoginAttempts() - 1);
    }

    private void blockUser(User user) {
        user.setBlocked(true);
    }

    private void restoreAttempts(User user) {
        user.setLoginAttempts(3);
    }
}
