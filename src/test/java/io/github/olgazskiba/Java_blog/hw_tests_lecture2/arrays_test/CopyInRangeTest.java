package io.github.olgazskiba.Java_blog.arrays;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Copy;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class CopyInRangeTest {
    public Logger log = Logger.getLogger(CopyInRangeTest.class);

    @Test
    void copyInRange() {
        int[] sourceArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] destArr = {10, 111, 132, 433, 54, 9};

        System.arraycopy(sourceArr, 2, destArr, 1, 5);
        for (int i = 0; i < destArr.length; i++) {
           log.info(destArr[i] + " ");
        }
    }
}
