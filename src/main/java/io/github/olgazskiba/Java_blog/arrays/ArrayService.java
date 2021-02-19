package io.github.olgazskiba.Java_blog.arrays;

import java.util.Random;

public class ArrayService {

    public int[] create(int size) {
        int[] array = new int[size];
        return array;
    }

    void fillRandomly(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }

    public void sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum = " + sum);
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
}
