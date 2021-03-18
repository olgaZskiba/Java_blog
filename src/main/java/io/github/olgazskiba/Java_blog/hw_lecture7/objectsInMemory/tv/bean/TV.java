package io.github.olgazskiba.Java_blog.hw_lecture7.objectsInMemory.tv.bean;

/*
Функциональные требования:
Разработать класс телевизор Tv с учетом инкапсуляции, который обладает следующими характеристиками:
Свойства
Текущий канал
Текущая громкость
Производитель
Включен ли телевизор
Методы
Переключить на следующий канал (увеличить текущий канал на 1 ед.)
Переключить на предыдущий канал (уменьшить текущий канал на 1 ед.)
Увеличить звук (увеличить громкость на 1 ед.)
Уменьшик звук (уменьшить громкость на 1 ед.)
Включить телевизор
Выключить телевизор
Переключать каналы и менять громкость можно только у включенного телевизора.
Для каждого из полей написать вспомогательные методы getter (напр. int getCurrentChannel()).
Необходимо переопределить методы equals() и toString()
 */

import java.util.Objects;

public class TV {

    private int currentChannel;
    private int currentVolume;
    private String manufacturer;
    private boolean isOn;

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

//    public void turnOn() {
//        this.isOn = true;
//    }
//    public void turnOff() {
//        this.isOn = false;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TV tv = (TV) o;
        return currentChannel == tv.currentChannel && currentVolume == tv.currentVolume && isOn == tv.isOn && Objects.equals(manufacturer, tv.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentChannel, currentVolume, manufacturer, isOn);
    }

    @Override
    public String toString() {
        return "TV{" +
                "currentChannel=" + currentChannel +
                ", currentVolume=" + currentVolume +
                ", manufacturer='" + manufacturer + '\'' +
                ", isOn=" + isOn +
                '}';
    }
}
