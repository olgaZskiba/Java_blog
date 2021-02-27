package io.github.olgazskiba.Java_blog.hw_lecture3.operators;

import org.apache.log4j.Logger;

public class SignComparator {
    public Logger log = Logger.getLogger(SignComparator.class);

    public String compare(int number) {

        if (number > 0) {
           return "Number is positive";
        }
        else if (number < 0) {
            return "Number is negative";
        }
        else {
            return "Number is equal to zero";
        }
    }
}
