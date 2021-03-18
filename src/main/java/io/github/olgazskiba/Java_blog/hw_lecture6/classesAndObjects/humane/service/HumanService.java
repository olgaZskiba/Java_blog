package io.github.olgazskiba.Java_blog.hw_lecture6.classesAndObjects.humane.service;

import io.github.olgazskiba.Java_blog.hw_lecture6.classesAndObjects.humane.bean.Human;
import org.apache.log4j.Logger;

public class HumanService {
    Logger log = Logger.getLogger(HumanService.class);

    Human human;

    public HumanService(Human human) {
        this.human = human;
    }

    public void greet() {
        log.info("Hi! My name is " + human.getName() + " " + "I'm " + human.getAge() + " years old");
    }

}
