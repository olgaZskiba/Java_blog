package io.github.olgazskiba.Java_blog.hw_tests_lecture3.operators;

import io.github.olgazskiba.Java_blog.hw_lecture3.operators.Stock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class StockTest {

    @Test
    void updatePrice() {
        Stock stock = new Stock("goog", 50);

        double newPrice = 70;
        double newPrice1 = 45;

        stock.updatePrice(newPrice);
        stock.printInformation();

        stock.updatePrice(newPrice1);
        stock.printInformation();

        assertEquals(stock.getMaxPrice(), newPrice);
        assertEquals(stock.getMinPrice(), newPrice1);
    }
}