package io.github.olgazskiba.Java_blog.hw_lecture7.objectsInMemory.counter.service;

import io.github.olgazskiba.Java_blog.hw_lecture7.objectsInMemory.counter.bean.Counter;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterServiceTest {

    Logger log = Logger.getLogger(CounterServiceTest.class);

    Counter counter;
    CounterService counterService;

    @BeforeEach
    void setUp() {
        counter = new Counter();
        counterService = new CounterService(counter);
    }

    @Test
    void increment() {
        counter.setValue(10);
        counterService.increment();
        int expected = 11;
        int actual = counter.getValue();
        assertEquals(expected, actual);

        counter.setValue(100);
        counterService.increment();
        int expectedOver = 100;
        int actualOver = counter.getValue();
        assertEquals(expectedOver, actualOver);
    }


    @Test
    void decrement() {
        counter.setValue(10);
        counterService.decrement();
        int expected = 9;
        int actual = counter.getValue();
        assertEquals(expected, actual);


        counter.setValue(-1);
        counterService.decrement();
        int expectedNegative = -1;
        int actualNegative = counter.getValue();
        assertEquals(expectedNegative, actualNegative);
    }


    @Test
    void clear() {
        counter.setValue(200);
        counter.setStep(200);
        counterService.clear();
        int expectedValue = 0;
        int actualValue = counter.getValue();
        assertEquals(expectedValue, actualValue);
        int expectedStep = 1;
        int actualStep = counter.getStep();
        assertEquals(expectedStep, actualStep);

    }

    @Test
    void setValue() {
        counterService.setValue(10);
        int expected = 10;
        int actual = counter.getValue();
        assertEquals(expected, actual);

        counterService.setValue(110);
        int actual1 = counter.getValue();
        assertEquals(expected, actual1);
    }

    @Test
    void getValue() {
        counter.setValue(20);
        int expected = 20;
        int actual = counterService.getValue();
        assertEquals(expected, actual);
    }


    @Test
    void setStep() {
        counterService.setStep(2);
        int expected = 2;
        int actual = counter.getStep();
        assertEquals(expected, actual);

        counterService.setStep(11);
        int actual1 = counter.getStep();
        assertEquals(expected, actual1);
    }

    @Test
    void getStep() {
        counter.setStep(2);
        int expected = 2;
        int actual = counterService.getStep();
        assertEquals(expected, actual);
    }
}