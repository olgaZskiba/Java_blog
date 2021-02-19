package io.github.olgazskiba.Java_blog.arrays;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LookupArrayServiceTest {
    public Logger log = Logger.getLogger(ArraysLecture2Test.class);

    @Test
    void indexOfMax() {
        int[] arrey = {10, 20, 30};

        if (arrey.length == 0) {

            log.info("array is empty = " + -1);
        }
        int idx = 0;
        for (int i = 0; i < arrey.length; i++) {
            if (arrey[idx] < arrey[i]) {
                idx = i;
            }
        }
        log.info("Max index of array = " + idx);
        assertEquals(3, arrey.length);
    }


    @Test
    void indexOfMin() {
        int[] arrey2 = {10, 20, 30};
        if (arrey2.length == 0) {
            log.info("array is empty = " + -1);
        }
        int idx = 0;
        for (int i = 0; i < arrey2.length; i++) {
            if (arrey2[idx] > arrey2[i]) {
                idx = i;
            }
        }
        log.info("Max index of array = " + idx);
        assertEquals(3, arrey2.length);
    }

    @Test
    void indexOf() {
        int[] array3 = {10, 20, 30};

        if (array3.length == 0) {
            log.info("array is empty = " + -1);
        }

        int value = 20;

        for (int i = 0; i < array3.length; i++) {
            if (array3[i] == value) {
                log.info("value index of array = " + i);

            }
        }
        assertEquals(3, array3.length);
        assertEquals(20, value);
    }

    @Test
    void findMax() {
        int[] array4 = {10, 20, 30};
        if (array4.length == 0) {

            log.info("array is empty = " + 0);
        }
        int max = array4[0];
        for (int i = 0; i < array4.length; i++) {
            if (array4[i] > max) {
                max = array4[i];
            }
        }
        log.info("value index of array = " + max);
        assertEquals(3, array4.length);
        assertEquals(30, max);
    }

    @Test
    void findMin() {
        int[] array5 = {10, 20, 30};
        if (array5.length == 0) {

            log.info("array is empty = " + 0);
        }
        int min = array5[0];
        for (int i = 0; i < array5.length; i++) {
            if (array5[i] < min) {
                min = array5[i];
            }
        }
        log.info("value index of array = " + min);
        assertEquals(3, array5.length);
        assertEquals(10, min);

    }
}







