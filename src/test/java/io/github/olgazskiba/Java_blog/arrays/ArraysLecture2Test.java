package io.github.olgazskiba.Java_blog.arrays;

import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysLecture2Test {
    public Logger log = Logger.getLogger(ArraysLecture2Test.class);

    @Test
    void arrays() {
        int[] ints = new int[10];
        boolean[] booleans = new boolean[4];
        Object[] objects = new Object[3];
        Object[] objectStrings = new String[3];

        log.info(ints[0]);
        log.info(booleans[0]);
        log.info(objects[0]);
        log.info(objectStrings[0]);
    }

    @Test
    public void myTest() {
        int[] intsA = new int[]{1, 2, 3, 4, 5,};
        log.info(intsA.length);

    }

    @Test
    public void test1() {
        ArraysLecture2 myArrays = new ArraysLecture2();

        log.info("init " + myArrays.ints[5]);
        log.info("init " + myArrays.objectStrings[0]);

        assertEquals(0, myArrays.ints[5]);
        assertNull(myArrays.objectStrings[0]);

    }

    @Test
    public void test2() {
        int[] ints = new int[10];
        boolean[] booleans = new boolean[10];
        String[] strings = new String[10];
        MyClass[] myClasses = new MyClass[10];
        MyClass[][] twoDimMyClasses = new MyClass[10][];

        log.info("parent: " + ints.getClass().getSuperclass() + "\tclassname: " + ints.getClass().getName());
        log.info("parent: " + booleans.getClass().getSuperclass() + "\tclassname: " + booleans.getClass().getName());
        log.info("parent: " + strings.getClass().getSuperclass() + "\tclassname: " + strings.getClass().getName());
        log.info("parent: " + myClasses.getClass().getSuperclass() + "\tclassname: " + myClasses.getClass().getName());
        log.info("parent: " + twoDimMyClasses.getClass().getSuperclass() + "\tclassname: " + twoDimMyClasses.getClass().getName());

    }

    @Test //(expected = ArrayIndexOutOfBoundsException.class);
    public void shouldThrowException() {
        int[] ints = new int[10];
        log.info("print: " + ints[9]);
    }

   //@Test //(expected = ArrayIndexOutOfBoundsException.class);
   //public void shouldThrowNSAException() {
   //    int[] negativeLength = new int[-1];
   //}

    //@Test //(expected = ArrayIndexOutOfBoundsException.class);
    //public void shouldThrowNSAException1() {
    //    Assertions.assertThrows(NegativeArraySizeException.class, () -> {
    //        int[] negativeLength = new int[-1];
    //    });
    //}
    @Test
    public void cloning(){
        String[] strings = {"a", "a", "a", "a", "a", "a"};
        String[] copyStrings = strings.clone();
        assertNotSame(strings, copyStrings);
        assertArrayEquals(strings, copyStrings);

        int[] ints = new int[]{1,2,3,4,5};
        int[] copyInts = ints.clone();
        assertNotSame(ints,copyInts);
        assertArrayEquals(ints, copyInts);
    }

    @Test
    public void covariantTest(){
        Number[] numbers = {1, 2L, 2.0, 3.0F, (byte) 7, (short) 3};
        Object[] objects = {new Object(), 2, 4L, "new Arrays()"};
    }



}