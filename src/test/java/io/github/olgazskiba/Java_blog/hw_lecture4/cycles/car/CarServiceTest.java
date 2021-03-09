package io.github.olgazskiba.Java_blog.hw_lecture4.cycles.car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarServiceTest {


    CarService carService = new CarService();
    Car car = new Car("Reno", "Gold", 240);


    @Test
    void accelerate() {
        car.setCurrentSpeed(180);
        carService.accelerate(190, car);
        car.setCurrentSpeed(210);
        carService.accelerate(190, car);
    }

    @Test
    void decelerate() {
        car.setCurrentSpeed(50);
        carService.decelerate(100, car);
        car.setCurrentSpeed(150);
        carService.decelerate(100, car);
    }

    @Test
    void isDriving() {
        car.setCurrentSpeed(10);
        assertTrue(carService.isDriving(car));
        car.setCurrentSpeed(0);
        assertFalse(carService.isDriving(car));
    }

    @Test
    void isStopped() {
        car.setCurrentSpeed(0);
        assertTrue(carService.isStopped(car));
        car.setCurrentSpeed(20);
        assertFalse(carService.isStopped(car));
    }

    @Test
    void canAccelerate() {
        car.setCurrentSpeed(50);
        assertTrue(carService.canAccelerate(car));
        car.setCurrentSpeed(240);
        assertFalse(carService.canAccelerate(car));

    }
}