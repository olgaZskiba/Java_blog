package io.github.olgazskiba.Java_blog.hw_lecture5.exceptions.bean;

/*
Необходимо разработать следующие классы:

Класс User - представляет сущность пользователя со следующими характеристиками:

firstName - имя пользователя
lastName - фамилия пользователя
age - возраст пользователя
 */

public class User {
    private String firstName;
    private String lastName;
    private int age;

    public User() {
    }

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
