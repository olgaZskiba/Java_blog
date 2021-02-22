package io.github.olgazskiba.Java_blog.hw_tests_lecture2.arrays_test;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    public Logger log = Logger.getLogger(PalindromeTest.class);

    @Test
    void isPalindrome() {
        boolean notPalindrome = false;
        String string = "ABBA";

        string = string.replaceAll("[^a-zA-Z]+","").toLowerCase();

        char[] array = string.toCharArray();
        for(int i=0, j=array.length-1; i<j; i++, j--) {
            if(array[i] != array[j]) {
                notPalindrome = true;
                break;
            }
        }
        log.info(string + " is palindrome? " + !notPalindrome);
        assertEquals(true, !notPalindrome);
    }

    }
