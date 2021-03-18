package io.github.olgazskiba.Java_blog.hw_lecture6.classesAndObjects.circle.service;

import io.github.olgazskiba.Java_blog.hw_lecture6.classesAndObjects.circle.bean.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleServiceTest {

    @Test
    void calculateArea() {
        Circle circle = new Circle(2);
        CircleService circleService = new CircleService(circle);
        assertEquals(12.56, circleService.calculateArea(), 2);
    }
    @Test
    void calculateAreaThrowPoint(){
        Circle circle =new Circle();
        CircleService circleService = new CircleService(circle);
        circle.setRadius(5.5);
        assertEquals(34.55751, circleService.calculateArea(), 5);
    }
}