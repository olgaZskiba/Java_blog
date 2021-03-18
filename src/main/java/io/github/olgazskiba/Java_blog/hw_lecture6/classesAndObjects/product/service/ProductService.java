package io.github.olgazskiba.Java_blog.hw_lecture6.classesAndObjects.product.service;

import io.github.olgazskiba.Java_blog.hw_lecture6.classesAndObjects.product.bean.Product;
import org.apache.log4j.Logger;

public class ProductService {

    Logger log = Logger.getLogger(ProductService.class);

    Product product;

    public ProductService(Product product){
        this.product = product;
    }

    public double actualPrice(){
        double actualPrice =product.getRegularPrice() - (product.getRegularPrice()*(product.getDiscount()*0.01));
        log.info(actualPrice);
        return actualPrice;
    }

    public void printInformation(){
        log.info("Product: " + product.getName() + ", regular price = " + product.getRegularPrice() + "EUR, discount = " +
                + product.getDiscount() + "%, actual price = " + actualPrice() + "EUR" );
    }
}
