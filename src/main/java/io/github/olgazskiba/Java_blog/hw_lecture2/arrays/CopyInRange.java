package io.github.olgazskiba.Java_blog.hw_lecture2.arrays;

import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Copy;

public class CopyInRange {
    public int[] copyInRange(int[] in, int leftBound, int rightBound) {

        int[] sourceArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] destArr = new int[5];

        System.arraycopy(sourceArr, 5, destArr, 0, 5);
        for (int i = 0; i < destArr.length; i++) {
            System.out.print(destArr[i] + " ");

        }
        return destArr;
    }
}


