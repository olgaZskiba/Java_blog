package io.github.olgazskiba.Java_blog.hw_lecture2.arrays;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;
import java.util.*;
import org.apache.log4j.Logger;

public class ArrayService {
    private Random rand = SecureRandom.getInstanceStrong();
    public Logger log = Logger.getLogger(ArrayService.class);

    public ArrayService() throws NoSuchAlgorithmException {
    }

    public int[] create(int size) {
        return new int[size];
    }

    public void fillRandomly(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt( 101);
        }
    }

    public int getSumOfArray(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            log.info(array[i]);
    }

    public int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        log.info("Sum = " + sum);
        return sum;
    }

    public double avg(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        double average = 0;
        if (array.length > 0) {
            double sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            average = sum / array.length;

        }
        return average;
    }

    public void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            log.info(array[i] + "  ");
        }
        log.info("\nSorted: \n");
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            log.info(array[i] + "  ");
        }
    }

    public void swap(Integer[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            log.info(array[i] + "  ");
        }
        log.info("\nSorted: \n");
        Arrays.sort(array, Collections.reverseOrder());
        for (int i = 0; i < array.length; i++) {
            log.info(array[i] + "  ");
        }
    }
}
