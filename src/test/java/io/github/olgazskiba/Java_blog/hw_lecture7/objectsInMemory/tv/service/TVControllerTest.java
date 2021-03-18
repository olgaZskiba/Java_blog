package io.github.olgazskiba.Java_blog.hw_lecture7.objectsInMemory.tv.service;

import io.github.olgazskiba.Java_blog.hw_lecture7.objectsInMemory.tv.bean.TV;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TVControllerTest {

   TV tv;
   TVController tvController;

    @BeforeEach
    void setUp(){
        tv = new TV();
        tvController = new TVController(tv);
    }

    @Test
    void switchToNextChannel() {
        tvController.setConnectedTV(true);
        tv.setOn(true);
        tv.setCurrentChannel(7);
        tvController.switchToNextChannel();
        int expected = 8;
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual);

        tvController.setConnectedTV(false);
        tvController.switchToNextChannel();
        assertFalse(tvController.isConnectedTV());
    }


    @Test
    void switchToPreviousChannel() {
        tvController.setConnectedTV(true);
        tv.setOn(true);
        tv.setCurrentChannel(7);
        tvController.switchToPreviousChannel();
        int expected = 6;
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual);

        tvController.setConnectedTV(false);
        tvController.switchToNextChannel();
        assertFalse(tvController.isConnectedTV());
    }

    @Test
    void increaseSound() {
        tvController.setConnectedTV(true);
        tv.setOn(true);
        tv.setCurrentVolume(20);
        tvController.increaseSound();
        int expected = 21;
        int actual = tv.getCurrentVolume();
        assertEquals(expected, actual);

        tvController.setConnectedTV(false);
        tvController.increaseSound();
        assertFalse(tvController.isConnectedTV());
    }

    @Test
    void reduceSound() {
        tvController.setConnectedTV(true);
        tv.setOn(true);
        tv.setCurrentVolume(20);
        tvController.reduceSound();
        int expected = 19;
        int actual = tv.getCurrentVolume();
        assertEquals(expected, actual);

        tvController.setConnectedTV(false);
        tvController.reduceSound();
        assertFalse(tvController.isConnectedTV());
    }

    @Test
    void turnOnTheTV() {
        tvController.setConnectedTV(true);
        tv.setOn(false);
        tvController.turnOnTheTV();
        assertTrue(tv.isOn());

        tvController.setConnectedTV(false);
        tvController.turnOnTheTV();
        assertTrue(tv.isOn());
    }


    @Test
    void turnOffTheTV() {
        tvController.setConnectedTV(true);
        tv.setOn(true);
        tvController.turnOffTheTV();
        assertFalse(tv.isOn());

        tvController.setConnectedTV(false);
        tvController.turnOffTheTV();
        assertFalse(tv.isOn());
    }
}