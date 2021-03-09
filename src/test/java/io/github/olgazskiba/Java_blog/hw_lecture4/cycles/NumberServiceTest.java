package io.github.olgazskiba.Java_blog.hw_lecture4.cycles;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberServiceTest {

    NumberService numberService = new NumberService();

    @Test
    void rangeSum() {
        assertEquals(14, numberService.rangeSum(2, 5));
        assertEquals(14, numberService.rangeSum(5, 2));
    }

    @Test
    void rangeEvenCount() {
        assertEquals(4, numberService.rangeEvenCount(1, 9));
        assertEquals(4, numberService.rangeEvenCount(9, 1));
    }
}