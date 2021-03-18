package io.github.olgazskiba.Java_blog.hw_lecture6.classesAndObjects.dog.bean;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    Dog dog = new Dog();

    @Test
    void getAge() {
        dog.setAge(5);
        int expected = 5;
        int actual = dog.getAge();
        assertEquals(expected, actual);
    }

    @Test
    void getColor() {
        dog.setColor("chocolate");
        String expected = "chocolate";
        String actual = dog.getColor();
        assertEquals(expected, actual);
    }

    @Test
    void getName() {
        dog.setName("Lukas");
        String expected = "Lukas";
        String actual = dog.getName();
        assertEquals(expected, actual);
    }

    @Test
    void testEquals() {
        Dog dog = new Dog(3, "black", "David");
        Dog dog1 = new Dog(3, "black", "David");

        boolean expected = true;
        boolean actual = dog.equals(dog1);
        assertEquals(expected, actual);
    }

    @Test
    void testHashCode() {

        int expected = 29791;
        int actual = dog.hashCode();
        assertEquals(expected, actual);
    }

}