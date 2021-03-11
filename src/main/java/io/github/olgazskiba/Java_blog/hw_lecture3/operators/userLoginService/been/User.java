package io.github.olgazskiba.Java_blog.hw_lecture3.operators.userLoginService.been;

/*
Класс User должен представлять сущность пользователя и обладать следующими характеристиками:
Свойства
Логин
Пароль
Заблокирован ли пользователь
Количество попыток для входа в учетную запись, до блокировки пользователя
(по-умолчанию максимальное количество попыток равно 3)
Методы
Сбросить количество попыток входа
Заблокировать пользователя
 */

import java.util.Objects;

public class User {
    private String login;
    private String password;
    private int loginAttempts = 3;
    private boolean blocked;

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLoginAttempts() {
        return loginAttempts;
    }

    public void setLoginAttempts(int loginAttempts) {
        this.loginAttempts = loginAttempts;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", loginAttempts=" + loginAttempts +
                ", blocked=" + blocked +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return loginAttempts == user.loginAttempts && blocked == user.blocked && Objects.equals(login, user.login) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, loginAttempts, blocked);
    }
}
