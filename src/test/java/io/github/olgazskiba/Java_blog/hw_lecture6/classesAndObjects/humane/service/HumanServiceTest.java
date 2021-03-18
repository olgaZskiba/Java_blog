package io.github.olgazskiba.Java_blog.hw_lecture6.classesAndObjects.humane.service;

import io.github.olgazskiba.Java_blog.hw_lecture6.classesAndObjects.humane.bean.Human;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanServiceTest {

    @Test
    void greet() {
        Human human = new Human("John", 20);
        HumanService humanService = new HumanService(human);
        humanService.greet();
        String expected = "Human{name='John', age=20}";
        String actual = human.toString();
        assertEquals(expected, actual);
    }

    @Test
    void getName() {
        Human human = new Human("John", 20);
        assertEquals("John", human.getName());
    }

    @Test
    void grtAge() {
        Human human = new Human("John", 20);
        assertEquals(20, human.getAge());
    }
}

