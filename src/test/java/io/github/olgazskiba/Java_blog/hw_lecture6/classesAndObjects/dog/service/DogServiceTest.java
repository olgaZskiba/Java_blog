package io.github.olgazskiba.Java_blog.hw_lecture6.classesAndObjects.dog.service;

import io.github.olgazskiba.Java_blog.hw_lecture6.classesAndObjects.dog.bean.Dog;
import org.junit.jupiter.api.Test;

class DogServiceTest {


    @Test
    void voice() {
        Dog dog = new Dog(2, "black", "Taras");
        DogService dogService = new DogService(dog);
        dogService.voice();
    }

    @Test
    void eat() {
        Dog dog = new Dog();
        DogService dogService = new DogService(dog);
        dog.setColor("chocolate");
        dogService.eat();
    }

    @Test
    void sleep() {
        Dog dog = new Dog();
        DogService dogService = new DogService(dog);
        dogService.sleep();

    }
}