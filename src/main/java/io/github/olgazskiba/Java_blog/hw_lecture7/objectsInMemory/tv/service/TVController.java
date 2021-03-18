package io.github.olgazskiba.Java_blog.hw_lecture7.objectsInMemory.tv.service;

import io.github.olgazskiba.Java_blog.hw_lecture7.objectsInMemory.tv.bean.TV;
import org.apache.log4j.Logger;

/*
Функциональные требования:
Разработать классы телевизор Tv и TvController с учетом инкапсуляции.
Класс Tv можно брать из предыдущего задания, поскольку требования идентичны.
Класс TvController должен обладать следующими характеристиками:
Свойства
Подключенный телевизор
Методы
Дублируются методы класса Tv
Подключить телевизор к пульту (выступает в роли setter метода для поля Tv tv)
Через пульт необходимо контролировать телевизор (напр. включать, менять канал или уровень громкости).
 */

public class TVController extends ServiceTV{

    Logger log = Logger.getLogger(TVController.class);

    public TVController(TV tv) {
        super(tv);
    }

    private boolean connectedTV;

    public boolean isConnectedTV() {
        return connectedTV;
    }

    public void setConnectedTV(boolean connectedTV) {
        this.connectedTV = connectedTV;
    }

    @Override
    public void switchToNextChannel() {
        if (connectedTV==true) {
            super.switchToNextChannel();
        }
        else if (connectedTV==false)
            log.info("No TV connection");
            return;
    }

    @Override
    public void switchToPreviousChannel() {
        if (connectedTV==true) {
        super.switchToPreviousChannel();
        }
        else if (connectedTV==false)
            log.info("No TV connection");
        return;
    }

    @Override
    public void increaseSound() {
        if (connectedTV == true) {
            super.increaseSound();
        }
        else if (connectedTV==false)
            log.info("No TV connection");
        return;
    }

    @Override
    public void reduceSound() {
        if (connectedTV == true) {
            super.reduceSound();
        }
        else if (connectedTV==false)
            log.info("No TV connection");
        return;
    }

    @Override
    public void turnOnTheTV() {
        if (connectedTV == true) {
            super.turnOnTheTV();
        }
        else if (connectedTV==false)
            log.info("No TV connection");
        return;
    }

    @Override
    public void turnOffTheTV() {
        if (connectedTV == true) {
            super.turnOffTheTV();
        }
        else if (connectedTV == false)
            log.info("No TV connection");
        return;
    }
}
