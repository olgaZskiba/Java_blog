package io.github.olgazskiba.Java_blog.hw_tests_lecture2.arrays_test;

import io.github.olgazskiba.Java_blog.hw_lecture2.arrays.ArrayService;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.yaml.snakeyaml.util.ArrayUtils;

import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ArrayServiceTest {
    ArrayService arrayService = new ArrayService();

    public Logger log = Logger.getLogger(ArrayServiceTest.class);

    ArrayServiceTest() throws NoSuchAlgorithmException {
    }

    @Test
    void create() {
        assertEquals(10, arrayService.create(10).length);
    }

    @Test
    void fillRandomly() {
        int[] array = new int[5];
        arrayService.fillRandomly(array);
        assertNotEquals(0, arrayService.getSumOfArray(array));
    }

    @Test
    void printArray() {
      int[] array = new int[3];
            arrayService.printArray(array);
        assertEquals(3, array.length);
    }

    @Test
    void sum() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(15, arrayService.sum(array));
    }

    @Test
    void avg() {
        int[] array = {15,15};
            assertEquals(15, arrayService.avg(array), 0);
            assertNotEquals(0, arrayService.avg(array));
        }

    @Test
    void sort() {
        int array[] = new int[4];
        arrayService.sort(array);
        assertEquals(true, array[0] < array[1]);
    }

    @Test
    void swap() {
        Integer array[] = new Integer[4];
        arrayService.swap(array);
        assertEquals(true, array[0] > array[1]);
        }
    }












