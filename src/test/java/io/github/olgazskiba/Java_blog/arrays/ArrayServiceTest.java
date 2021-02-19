package io.github.olgazskiba.Java_blog.arrays;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.yaml.snakeyaml.util.ArrayUtils;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ArrayServiceTest {
    public Logger log = Logger.getLogger(ArraysLecture2Test.class);

    @Test
    void create() {
        int size = 10;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            log.info(array[i]);
        }
        assertEquals(10, array.length);
    }


    @Test
    void fillRandomly() {
        int[] array = new int[1];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        for (int i = 0; i < array.length; i++) {
            log.info(array[i]);
        }

    }


    @Test
    void printArray() {
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            log.info(array[i]);
        }
        assertEquals(3, array.length);

    }

    @Test
    void sum() {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        log.info("Sum = " + sum);
        assertEquals(15, sum);
    }


    @Test
    void avg() {
        int[] array = {15,15};
        if (array.length == 0) {
            log.info(0);
            assertEquals(2, array.length);
        }
        double average = 0;
        if (array.length > 0) {
            double sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            log.info(average = sum / array.length);
            assertEquals(15, average);
        }
    }
}