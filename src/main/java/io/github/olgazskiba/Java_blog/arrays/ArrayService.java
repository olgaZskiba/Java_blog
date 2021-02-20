package io.github.olgazskiba.Java_blog.arrays;

import java.util.Random;
import java.util.*;

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

    void sort(int[] array) {
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }
        System.out.print("\nSorted: \n");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    void swap(Integer[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + "  ");
        }
        System.out.print("\nSorted: \n");
        Arrays.sort(array, Collections.reverseOrder());
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}
