package io.github.olgazskiba.Java_blog.wrapper;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WrapperTest {
    public Logger log = Logger.getLogger(Wrapper.class);

    @Test
    public void createWrapperWithConstructor(){

        Byte b1 = new Byte((byte) 10);
        Byte b2 = new Byte( "10");

        Long l1 = new Long(10);
        Long l2 = new Long("10");

        Boolean bool1 = new Boolean(null);
        Boolean bool2 = new Boolean(false);

        log.info("wrapper byte = " + b1 + " " + "wrapper byte = " + b2);
        log.info("wrapper long = " + l1 + " " + "wrapper long = " + l2);
        log.info("wrapper bool1 = " + bool1);
        assertEquals(b1, b2);
        assertNotSame(b1, b2);

    }
    @Test
    public void createWrapperWithValueOf(){
        Byte b1 = Byte.valueOf((byte) 10);
        Byte b2 = Byte.valueOf( "10");

        Long l1 = Long.valueOf(10);
        Long l2 = Long.valueOf("10");

        boolean equal = (b1 == b2);
        assertEquals(true, equal);
        assertSame(b1, b2);

        boolean equal2 = (l1 == l2);
        assertEquals(true, equal2);
        assertSame(l1, Long.valueOf(b1));

    }
    @Test
    public void wrapperInEitherTypes(){
        String s1 = "125";
        Integer i2 = new Integer(125);
        Integer sum = i2 + Integer.parseInt(s1);
        assertEquals(250, sum);
        log.info(sum);
    }

}