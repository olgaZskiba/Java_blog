package io.github.olgazskiba.Java_blog.hw_lecture7.objectsInMemory.tv.service;

/*
Методы
Переключить на следующий канал (увеличить текущий канал на 1 ед.)
Переключить на предыдущий канал (уменьшить текущий канал на 1 ед.)
Увеличить звук (увеличить громкость на 1 ед.)
Уменьшик звук (уменьшить громкость на 1 ед.)
Включить телевизор
Выключить телевизор
Переключать каналы и менять громкость можно только у включенного телевизора.
 */

import io.github.olgazskiba.Java_blog.hw_lecture7.objectsInMemory.tv.bean.TV;
import org.apache.log4j.Logger;

public class ServiceTV {

    Logger log = Logger.getLogger(ServiceTV.class);

    private TV tv;

    public ServiceTV(TV tv){
        this.tv = tv;
    }

    public void switchToNextChannel(){
        if (tv.isOn()==true) {
            tv.setCurrentChannel(tv.getCurrentChannel() + 1);
            log.info("TV switch to next channel " + tv.getCurrentChannel());
        }
        else if (tv.isOn()==false)
            log.info("TV is turn Off");
            return;
    }

    public void switchToPreviousChannel(){
        if (tv.isOn()==true) {
            tv.setCurrentChannel(tv.getCurrentChannel() - 1);
            log.info("TV switch to previous channel " + tv.getCurrentChannel());
        }
        else if (tv.isOn()==false)
            log.info("TV is turn Off");
        return;
    }

    public void increaseSound(){
        if(tv.isOn()==true){
            tv.setCurrentVolume(tv.getCurrentVolume() + 1);
            log.info("Sound increased on " + tv.getCurrentVolume());
        }
        else if (tv.isOn()==false)
            log.info("TV is turn Off");
            return;
    }

    public void reduceSound(){
        if (tv.isOn()==true){
            tv.setCurrentVolume(tv.getCurrentVolume() - 1);
            log.info("Sound reduced on " + tv.getCurrentVolume());
        }
        else if (tv.isOn()==false)
            log.info("TV is turn Off");
        return;
    }

    public void turnOnTheTV(){
        if (tv.isOn()==false){
            tv.setOn(true);
            log.info("TV is turn ON");
        }
        else if(tv.isOn()==true)
        return;
    }

    public void turnOffTheTV(){
        if (tv.isOn()==true){
            tv.setOn(false);
            log.info("TV is turn OFF");
        }
        else if(tv.isOn()==false)
            return;
    }


}
