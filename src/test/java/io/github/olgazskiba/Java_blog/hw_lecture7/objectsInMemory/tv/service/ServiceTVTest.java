package io.github.olgazskiba.Java_blog.hw_lecture7.objectsInMemory.tv.service;

import io.github.olgazskiba.Java_blog.hw_lecture7.objectsInMemory.tv.bean.TV;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTVTest {

    TV tv;
    ServiceTV serviceTV;

    @BeforeEach
    void setUp(){
        tv = new TV();
        serviceTV = new ServiceTV(tv);
    }

    @Test
    void switchToNextChannel() {
        tv.setOn(true);
        tv.setCurrentChannel(5);
        serviceTV.switchToNextChannel();
        int expected = 6;
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual);

        tv.setOn(false);
        serviceTV.switchToNextChannel();
        assertFalse(tv.isOn());
    }

    @Test
    void switchToPreviousChannel() {
        tv.setOn(true);
        tv.setCurrentChannel(5);
        serviceTV.switchToPreviousChannel();
        int expected = 4;
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual);

        tv.setOn(false);
        serviceTV.switchToPreviousChannel();
        assertFalse(tv.isOn());
    }

    @Test
    void increaseSound() {
        tv.setOn(true);
        tv.setCurrentVolume(10);
        serviceTV.increaseSound();
        int expected = 11;
        int actual = tv.getCurrentVolume();
        assertEquals(expected, actual);

        tv.setOn(false);
        serviceTV.increaseSound();
        assertFalse(tv.isOn());
    }

    @Test
    void reduceSound() {
        tv.setOn(true);
        tv.setCurrentVolume(10);
        serviceTV.reduceSound();
        int expected = 9;
        int actual = tv.getCurrentVolume();
        assertEquals(expected, actual);

        tv.setOn(false);
        serviceTV.increaseSound();
        assertFalse(tv.isOn());
    }

    @Test
    void turnOnTheTV() {
        tv.setOn(false);
        serviceTV.turnOnTheTV();
        assertTrue(tv.isOn());

        tv.setOn(true);
        serviceTV.turnOnTheTV();
        assertTrue(tv.isOn());
    }

    @Test
    void turnOffTheTV() {
        tv.setOn(true);
        serviceTV.turnOffTheTV();
        assertFalse(tv.isOn());

        tv.setOn(false);
        serviceTV.turnOffTheTV();
        assertFalse(tv.isOn());
    }
}