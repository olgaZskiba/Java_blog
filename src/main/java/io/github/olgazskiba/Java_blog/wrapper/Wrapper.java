package io.github.olgazskiba.Java_blog.wrapper;

import org.apache.log4j.Logger;

public class Wrapper {

    public Logger log = Logger.getLogger(Wrapper.class);
    Byte b1 = 10;
    Long l1 = 10L;

    public void test(){
        log.info("Wrapper Byte = " + b1 + " " +"Wrapper Long = " + l1);

    }

}
