package io.github.olgazskiba.Java_blog.arrays;


import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class lecture2Test {

   public Logger log = Logger.getLogger(lecture2Test.class);

    @Test
    public void createWrapperWithConstructor() {
        Integer i1 = new Integer(20);
        Integer i2 = new Integer("10");
        //Integer i3 = new Integer("10.3");
        Short s1 = new Short((short) 10);

    }
    @Test
    public void createBooleanWrapper() {
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean(false);
        Boolean b3 = new Boolean(null);
        assertEquals(b2, b3);
    }
    @Test
    public void createWrapperWithValueOf(){
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf("10");
        assertEquals(i1, i2);
    }
    @Test
    public void newWrapperFromCash(){
        Integer i1 = 127;
        Integer i2 = 127;
        Long f1 = 127L;
        assertSame(i1, Integer.valueOf(Math.toIntExact(Long.valueOf(127L))));
    }
    @Test
    public void unboxing() {
        Integer i1 = 1_000_000;
        int i = i1.intValue();
        short s = i1.shortValue();
        log.info(i);
        System.out.println(i + " " + s);
    }
    @Test
    public void maxAndMin(){
        log.info(Integer.MAX_VALUE);
        log.info(Integer.MIN_VALUE);
        log.info(Short.SIZE);
        log.info(Short.BYTES);

    }



}