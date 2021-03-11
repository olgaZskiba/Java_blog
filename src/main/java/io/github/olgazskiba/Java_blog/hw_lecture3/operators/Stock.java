package io.github.olgazskiba.Java_blog.hw_lecture3.operators;
/*
Необходимо реализовать класс Stock ("акция") таким образом, чтобы была возможность
узнать текущую цену акции, а также ее максимальную и минимальную стоимость за период существования.
Класс Stock должен обладать следующими характеристиками:

Свойства
Имя компании
Текущая стоимость
Минимальная стоимость
Максимальная стоимость

Методы
Обновить текущую стоимость акции updatePrice()
Распечатать информацию об акции printInformation()
Имя компании и начальную стоимость необходимо задавать в момент создания акции.
Текущая, минимальная и максимальная стоимость должны меняться только через метод updatePrice().
 */

import org.apache.log4j.Logger;

public class Stock {

    Logger log = Logger.getLogger(Stock.class);

    private String nameOfCompany;
    private double currentPrice;
    private double minPrice;
    private double maxPrice;

    public double updatePrice(double newPrice) {
        if (newPrice <= 0) {
            return currentPrice;
        }
        if (newPrice > maxPrice) {
            maxPrice = newPrice;
        }
        if (newPrice < minPrice) {
            minPrice = newPrice;
        }
        currentPrice = newPrice;
        return currentPrice;
    }

    public void printInformation() {

        log.info("name Of Company: " + nameOfCompany + " " + "current Price = " + currentPrice +
                " " + "min Price = " + minPrice + " " + "max Price = " + maxPrice);
    }


    public Stock(String nameOfCompany, double currentPrice) {
        this.nameOfCompany = nameOfCompany;
        this.currentPrice = currentPrice;
        maxPrice = currentPrice;
        minPrice = currentPrice;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public double getMaxPrice() {
        return maxPrice;
    }
}
