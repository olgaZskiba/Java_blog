package io.github.olgazskiba.Java_blog.hw_lecture4.cycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbersTest {

    PrimeNumbers primeNumbers = new PrimeNumbers();

    @Test
    void primeNumbersSearch() {
        assertEquals(5501, primeNumbers.primeNumbersSearch());

    }

    @Test
    void checkSimple() {
        assertTrue(primeNumbers.checkSimple(7));
    }

}