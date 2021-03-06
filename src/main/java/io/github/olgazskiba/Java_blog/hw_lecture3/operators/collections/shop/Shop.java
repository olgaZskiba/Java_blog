package io.github.olgazskiba.Java_blog.hw_lecture3.operators.collections.shop;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static io.github.olgazskiba.Java_blog.hw_lecture3.operators.collections.shop.App.*;

//Необходимо разработать систему учета продуктов.
//Для этого нужно создать два класса: товар Product и магазин Shop.
//Класс Product описывает наименование товара и его стоимость (BigDecimal).
//
//Создать товар можно только с именем и стоимостью и свойства не должны изменяться после создания обьекта.
//Класс Shop описывает примитивный магазин, в котором содержится список товаров.
//Должен выполнять следующие функции:
//
//   Добавить товар
//   Удалить товар
//   Найти товар по названию
//   Найти все товары, которые входят в ценовой диапазон (findProduct(BigDecimal minPriceRange, BigDecimal maxPriceRange)
//Создать магазин можно как с пустым списком товаров, так и с начальным набором.
public class Shop {

    List<Product> productList = new LinkedList<>();

    public void addProduct(Product product) {
        if (product != null)
            productList.add(product);
        log.info(product);
    }

    public void deleteProduct(Product product) {
        productList.remove(product);
        log.info(product + " was delete");
    }

    public Product findeProducte(String productName) {
        Product productFinde = null;
        for (Product product : productList) {
            if (product.getProductName().equals(productName)) {
                productFinde = product;
            }
        }
        log.info(productFinde);
        return productFinde;
    }

    public List<Product> findeAllProducte(double minPriceRange, double maxPriceRange){
        List<Product> products = new ArrayList<>();
        for (Product product: productList) {
            if (product.getProductPrice() > minPriceRange && product.getProductPrice() < maxPriceRange){
                products.add(product);}

        }
        log.info(products);
        return products;
    }

}