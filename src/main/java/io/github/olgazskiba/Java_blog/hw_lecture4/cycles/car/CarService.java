package io.github.olgazskiba.Java_blog.hw_lecture4.cycles.car;

import org.apache.log4j.Logger;

/**
 * Ускориться: void accelerate(int targetSpeed) - должен увеличивать скорость автомобиля используя цикл.
 * В каждой итерации скорость нужно увеличивать на 1 ед. до достижения заданной скорости
 * или максимально допустимой скорости автомобиля. Если текущая скорость автомобиля больше заданной,
 * то автомобиль ускоряться не должен.
 * <p>
 * Замедлиться: void decelerate(int targetSpeed) - должен уменьшать скорость автомобиля используя цикл.
 * В каждой итерации скорость нужно уменьшать на 1 ед. до достижения заданной скорости
 * или полной остановки автомобиля. Если текущая скорость меньше заданной,
 * то автомобиль замедляться не должен.
 * <p>
 * Находится ли автомобиль в движении: boolean isDriving() - возвращает true
 * если скорость автомобиля больше 0.
 * <p>
 * Стоит ли автомобиль на месте: boolean isStopped() - возвращает true если скорость автомобиля равна 0.
 * <p>
 * Есть ли возможность ускориться: boolean canAccelerate() - возвращает true если
 * текущая скорость меньше максимальной.
 */

public class CarService {

    Logger log = Logger.getLogger(CarService.class);


    public void accelerate(int targetSpeed, Car car) {
        int speed = car.getCurrentSpeed();
        if (speed < targetSpeed) {
            for (int i = speed; i <= targetSpeed; i++) {
                log.info("picking up speed " + i);
            }
        } else {
            log.info(speed);
        }
    }

    public void decelerate(int targetSpeed, Car car) {
        int speed = car.getCurrentSpeed();
        if (speed > targetSpeed) {
            for (int i = speed; i >= targetSpeed; i--) {
                log.info("slow down " + i);
            }
        } else {
            log.info(speed);
        }
    }

    public boolean isDriving(Car car) {
        int speed = car.getCurrentSpeed();
        if (speed > 0) {
            return true;
        }
        return false;
    }

    public boolean isStopped(Car car) {
        int speed = car.getCurrentSpeed();
        if (speed == 0) {
            return true;
        }
        return false;
    }

    public boolean canAccelerate(Car car) {
        if (car.getCurrentSpeed() < car.getMaxSpeed()) {
            return true;
        }
        return false;
    }

}
