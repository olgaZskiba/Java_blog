package io.github.olgazskiba.Java_blog.hw_lecture3.operators.collections.shop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {
    Shop shop = new Shop();
    Product product1;
    Product product2;
    Product product3;
    Product product4;

    @BeforeEach
    public void setShop(){
        product1 = new Product("Steak", 12.99);
        product2 = new Product("Fries", 3.99);
        product3 = new Product("Salad", 6.99);
        product4 = new Product("Sauce", 0.99);

        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);
        shop.addProduct(product4);
    }

    @Test
    void addProduct() {
        assertEquals(4, shop.productList.size());

        shop.addProduct(new Product("Coffee", 2.49));
        assertEquals(5, shop.productList.size());
        shop.addProduct(null);
        assertEquals(5, shop.productList.size());
    }

    @Test
    void deleteProduct() {
        shop.deleteProduct(product4);
        assertEquals(3,shop.productList.size());
    }

    @Test
    void findeProducte() {
        assertEquals(product3, shop.findeProducte("Salad"));
        Product product5;
        shop.addProduct(product5 = new Product("Salad", 7.99));
        assertEquals(product5, shop.findeProducte("Salad"));
        assertNotEquals(product3, shop.findeProducte("Salad"));
    }

    @Test
    void findeAllProducte() {
        shop.findeAllProducte(3.0, 8.0);
    }
}