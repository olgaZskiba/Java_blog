package io.github.olgazskiba.Java_blog.hw_tests_lecture2.arrays_test;

import io.github.olgazskiba.Java_blog.hw_lecture2.arrays.LookupArrayService;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LookupArrayServiceTest {
    public Logger log = Logger.getLogger(LookupArrayServiceTest.class);
    LookupArrayService lookupArrayService = new LookupArrayService();

    @Test
    void indexOfMax() {
        int[] arrey = {10, 20, 30};
        assertEquals(2, lookupArrayService.indexOfMax(arrey));
        lookupArrayService.indexOfMax(arrey);
        assertNotEquals(0, arrey.length);
    }

    @Test
    void indexOfMin() {
        int[] arrey2 = {10, 20, 30};
        assertEquals(0, lookupArrayService.indexOfMin(arrey2));
        lookupArrayService.indexOfMin(arrey2);
        assertNotEquals(0, arrey2.length);
    }

    @Test
    void indexOf() {
        int[] array3 = {10, 20, 30};
        int value = 20;

        lookupArrayService.indexOf(array3, value);
        assertEquals(1, lookupArrayService.indexOf(array3, value));
        assertNotEquals(0, array3.length);
    }

    @Test
    void findMax() {
        int[] array4 = {10, 20, 30};
        assertEquals(30, lookupArrayService.findMax(array4));
        lookupArrayService.findMax(array4);
        assertNotEquals(0, array4.length);
    }

    @Test
    void findMin() {
        int[] array5 = {10, 20, 30};
        assertEquals(10, lookupArrayService.findMin(array5));
        lookupArrayService.findMin(array5);
        assertNotEquals(0, array5.length);
    }
}







