package io.github.olgazskiba.Java_blog.hw_lecture6.classesAndObjects.encoder;

/*
1. Разработать класс - кодировщик, у которого должны быть следующие характеристики:
Методы:
    Преобразование кода в символ и вывод на экран (void encode(short code))1P
    Преобразование символ в код и вывод на экран (void decode(char symbol))2P
 */

import org.apache.log4j.Logger;

public class Encoder {

    Logger log = Logger.getLogger(Encoder.class);

    public char encode(short code){
        char encode  = (char) code;
        log.info("input parameter: " + code + " => " + encode);
        return encode;
    }

    public int decode(char symbol){
        int decode = symbol;
        log.info("input parameter: " + symbol + " => " + decode);
        return decode;
    }


}
