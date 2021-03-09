package io.github.olgazskiba.Java_blog.hw_lecture4.cycles.car;

import org.apache.log4j.Logger;

import java.util.Objects;

/**
 * Разработать класс представляющий автомобиль, соблюдая инкапсуляцию,
 * который обладает следующими характеристиками:
 * Свойства
 * <p>
 * Модель
 * Цвет
 * Максимальная скорость
 * Текущая скорость
 * Методы
 * <p>
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
 * <p>
 * Модель, цвет и максимальная скорость должны задаваться через конструктор.
 * Текущая скорость может быть изменена только путем вызова основных методов.
 * <p>
 * Добавить вспомогательные getter методы, переопределить методы equals() и toString().
 */

public class Car {
    private String model;
    private String color;
    private int maxSpeed;
    private int currentSpeed;

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed && currentSpeed == car.currentSpeed && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, maxSpeed, currentSpeed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", currentSpeed=" + currentSpeed +
                '}';
    }

}



