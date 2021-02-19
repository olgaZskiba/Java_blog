package io.github.olgazskiba.Java_blog.arrays;

import java.util.Random;

public class Statistic {
    public static void main(String[] args) {
       // int [] array = new int[10];
        //Random random = new Random();
        //for(int i= 0; i < array.length; i++) {
          //  array[i] = random.nextInt();
           //}
        //for(int i= 0; i < array.length; i++){
       // System.out.println("array[" + i + "] = " + array[i]);
  //  }
        int [] elements = {1, 5, 3, 4, 7, 9, 8, 2, 6, 0};
        int idx = 0;
        for(int i = 0; i < elements.length; i++) {
            if (elements[idx] > elements [i]) {
                idx = i;
            }
        }
        System.out.println("idx = " + idx);
        System.out.println("elements[idx] = " + elements[idx]);
    }
}
