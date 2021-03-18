package io.github.olgazskiba.Java_blog.hw_lecture5.exceptions.service;

import io.github.olgazskiba.Java_blog.hw_lecture5.exceptions.bean.User;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Executable;

import static org.junit.jupiter.api.Assertions.*;

class UserValidationServiceTest {

    User user;
    UserValidationService userValidationService;

    @BeforeEach
    void setUp() {
        user = new User();
        userValidationService = new UserValidationService(user);
    }

    @Test
    void checkFirstNameTrue() {
        userValidationService.checkFirstName("Emma");
        assertEquals("Emma", user.getFirstName());
    }

    @Test
    public void checkIncorrectFirstName() {
        try {
            userValidationService.checkFirstName("oz");
        } catch (UserValidationException ex) {
            ex.printStackTrace();
        }
        Assertions.assertThrows(UserValidationException.class, () -> userValidationService.checkFirstName("Oz"));
    }

    @Test
    void checkLastNameTrue() {
        userValidationService.checkLastName("Watson");
        assertEquals("Watson", user.getLastName());
    }

    @Test
    void checkIncorrectLastName() {
        try {
            userValidationService.checkLastName("X");
        } catch (UserValidationException ex) {
            ex.printStackTrace();
        }
        Assertions.assertThrows(UserValidationException.class, () -> userValidationService.checkLastName("X"));
    }

    @Test
    void checkAgeTrue() {
        userValidationService.checkAge(18);
        assertEquals(18, user.getAge());
    }

    @Test
    void checkIncorrectAge() {
        try {
            userValidationService.checkAge(1500);
        } catch (UserValidationException ex) {
            ex.printStackTrace();
        }
        Assertions.assertThrows(UserValidationException.class, () -> userValidationService.checkAge(1500));
    }

}