package io.github.olgazskiba.Java_blog.hw_lecture6.classesAndObjects.dog.service;

/*
Методы:
Голос (void voice())
Есть (void eat())
Спать (void sleep())
2. Свойства можно задавать через оператор "." либо через конструктор.
3. Методы должны выводить произвольный текст с описанием действия в консоль.
 */

import io.github.olgazskiba.Java_blog.hw_lecture6.classesAndObjects.dog.bean.Dog;
import org.apache.log4j.Logger;

public class DogService {

    Logger log = Logger.getLogger(DogService.class);

    private Dog dog;

    public DogService(Dog dog){
        this.dog=dog;
    }


    public void voice(){
        log.info(dog.getName() + " barks: vuf, vuf, vuf");
    }

    public void eat(){
        log.info(dog.getColor() + " dog is eating: om-nom-nom");
    }

    public void sleep(){
        log.info("Dog is sleeping: z-z-z-z-z-z");
    }

}
