package io.github.olgazskiba.Java_blog.arrays;

import org.apache.log4j.Logger;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class JavaUtilArraysDemoTest {
    public Logger log = Logger.getLogger(ArraysLecture2Test.class);

    @Test
    public void javaUtilArraysDemoEqual(){
        String[] strings = {new String("a"), new String("a"), new String("a"), new String("a")};
        String[] copyStrings = strings.clone();

        assertTrue(Arrays.equals(strings, copyStrings));
    }

    @Test
    public void javaUtilArraysDemoDeepEqual(){
        int[][] ints1 = {{1,2},{3,4}};
        int[][] ints2 = {{1,2},{3,4}};

        assertFalse(Arrays.equals(ints1,ints2));
        assertTrue(Arrays.deepEquals(ints1, ints2));


    }
}
