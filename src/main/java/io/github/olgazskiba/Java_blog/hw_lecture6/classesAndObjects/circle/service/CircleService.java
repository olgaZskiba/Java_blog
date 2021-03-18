package io.github.olgazskiba.Java_blog.hw_lecture6.classesAndObjects.circle.service;

import io.github.olgazskiba.Java_blog.hw_lecture6.classesAndObjects.circle.bean.Circle;
import org.apache.log4j.Logger;

public class CircleService {
    Logger log = Logger.getLogger(CircleService.class);
    Circle circle;

    public CircleService(Circle circle){
        this.circle = circle;
    }

    public double calculateArea(){
        return (2*Math.PI*circle.getRadius());

    }
}
