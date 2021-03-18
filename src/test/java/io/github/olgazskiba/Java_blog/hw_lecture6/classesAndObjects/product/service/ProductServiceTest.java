package io.github.olgazskiba.Java_blog.hw_lecture6.classesAndObjects.product.service;

import io.github.olgazskiba.Java_blog.hw_lecture6.classesAndObjects.product.bean.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {

    Product product = new Product("Milk");
    ProductService productService = new ProductService(product);

    @Test
    void actualPrice() {
        product.setRegularPrice(0.8);
        product.setDiscount(20);
        double expected = 0.64;
        double actual = productService.actualPrice();
        assertEquals(expected,actual);
    }

    @Test
    void printInformation() {
        product.setRegularPrice(0.8);
        product.setDiscount(20);
        productService.printInformation();
    }

    @Test
    void testTestEquals() {
        Product product = new Product("Milk");
        product.setRegularPrice(1);
        product.setDiscount(20);

        Product product1 = new Product("Milk");
        product1.setRegularPrice(1);
        product1.setDiscount(20);

        boolean expected = true;
        boolean actual = product.equals(product1);
        assertEquals(expected, actual);
    }

    @Test
    void testHashCode(){
        Product product = new Product("Milk");
        product.setRegularPrice(0.8);
        product.setDiscount(20);

        int expected = -249304521;
        int actual = product.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    void testToString(){
        Product product = new Product("Milk");
        product.setRegularPrice(0.8);
        product.setDiscount(20);

        String expected = "Product{name='Milk', regularPrice=0.8, discount=20.0}";
        String actual = product.toString();
        assertEquals(expected, actual);

    }

}