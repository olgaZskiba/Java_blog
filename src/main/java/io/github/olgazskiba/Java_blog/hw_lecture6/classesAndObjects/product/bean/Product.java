package io.github.olgazskiba.Java_blog.hw_lecture6.classesAndObjects.product.bean;

/*
Разработать программу, которая позволяет создавать продукт с произвольным именем, стоимостью,
а также расчетом стоимости с учетом скидки.

Функциональные требования:

1. Разработать класс - продукт, у которого должны быть следующие характеристики:
Свойства:
    Наименование (String name)
    Стандартная цена (double regularPrice)
    Скидка в процентах (double discount)
Методы:
Расчет актуальной стоимости с учетом скидки (double actualPrice())
Вывод информации о продукте в консоль (void printInformation())1P
2. Название продукта нужно задавать через конструктор, а стоимость и скидку через оператор ".".

 */

import java.util.Objects;

public class Product {
    private String name;
    private double regularPrice;
    private double discount;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.regularPrice, regularPrice) == 0 && Double.compare(product.discount, discount) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, regularPrice, discount);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", regularPrice=" + regularPrice +
                ", discount=" + discount +
                '}';
    }
}
