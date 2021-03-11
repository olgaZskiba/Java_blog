package io.github.olgazskiba.Java_blog.hw_tests_lecture3.operators;

import io.github.olgazskiba.Java_blog.hw_lecture3.operators.userLoginService.been.User;
import io.github.olgazskiba.Java_blog.hw_lecture3.operators.userLoginService.service.UserLoginService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserLoginServiceTest {

    UserLoginService userLoginService;
    User user;
    User blockedUser;
    String positiveUserInput = "password";
    String negativeUserInput = "wrong";

    @BeforeEach
    public void setUp() {
        this.userLoginService = new UserLoginService();
        this.user = getUser();
        this.blockedUser = getBlockedUser();

        assertEquals(3, user.getLoginAttempts());
        assertFalse(user.isBlocked());

        assertEquals(0, blockedUser.getLoginAttempts());
        assertTrue(blockedUser.isBlocked());
    }

    @Test
    void checkUserPasswordPositive() {
        boolean actualResult = userLoginService.login(user, positiveUserInput);
        assertTrue(actualResult);
    }

    @Test
    void checkUserPasswordNegative() {
        boolean actualResult = userLoginService.login(user, negativeUserInput);
        assertFalse(actualResult);
    }

    @Test
    void reduceLoginAttempts() {
        userLoginService.login(user, negativeUserInput);
        assertEquals(2, user.getLoginAttempts());

    }

    @Test
    void loginPositive() {
        boolean actualResult = userLoginService.login(user, positiveUserInput);
        assertTrue(actualResult);
    }

    @Test
    void loginNegative() {
        boolean actualResult = userLoginService.login(user, negativeUserInput);
        assertFalse(actualResult);
        assertEquals(2, user.getLoginAttempts());
    }

    @Test
    void blockUser() {
        user.setLoginAttempts(1);
        userLoginService.login(user, negativeUserInput);
        assertTrue(user.isBlocked());
    }

    @Test
    public void after3WrongPasswords_ShouldBlockUser() {
        userLoginService.login(user, negativeUserInput);
        assertEquals(2, user.getLoginAttempts());
        assertFalse(user.isBlocked());

        userLoginService.login(user, negativeUserInput);
        assertEquals(1, user.getLoginAttempts());
        assertFalse(user.isBlocked());

        userLoginService.login(user, negativeUserInput);
        assertEquals(0, user.getLoginAttempts());
        assertTrue(user.isBlocked());
    }

    @Test
    void blockedUser_ShouldReturnFalse() {
        boolean actualResult = userLoginService.login(blockedUser, positiveUserInput);
        assertFalse(actualResult);
    }

    @Test
    void restoreAttempts() {
        user.setLoginAttempts(1);
        userLoginService.login(user, positiveUserInput);
        assertEquals(3, user.getLoginAttempts());
    }

    @Test
    void after1Incorrect_ShouldRestoreAttempts() {
        userLoginService.login(user, negativeUserInput);
        userLoginService.login(user, positiveUserInput);
        assertEquals(3, user.getLoginAttempts());
    }

    @Test
    void after2Incorrect_ShouldRestoreAttempts() {
        userLoginService.login(user, negativeUserInput);
        userLoginService.login(user, negativeUserInput);
        userLoginService.login(user, positiveUserInput);
        assertEquals(3, user.getLoginAttempts());
    }

    @Test
    void after3Incorrect_ShouldRestoreAttempts() {
        userLoginService.login(user, negativeUserInput);
        userLoginService.login(user, negativeUserInput);
        userLoginService.login(user, negativeUserInput);
        boolean actualResult = userLoginService.login(user, positiveUserInput);
        assertEquals(0, user.getLoginAttempts());
        assertTrue(user.isBlocked());
        assertFalse(actualResult);
    }

    private User getUser() {
        User user = new User();
        user.setPassword("password");
        return user;
    }

    private User getBlockedUser() {
        User user = new User();
        user.setPassword("password");
        user.setLoginAttempts(0);
        user.setBlocked(true);
        return user;
    }

}