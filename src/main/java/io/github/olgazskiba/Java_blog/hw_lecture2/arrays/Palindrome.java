package io.github.olgazskiba.Java_blog.hw_lecture2.arrays;

import org.apache.log4j.Logger;

public class Palindrome {

    public Logger log = Logger.getLogger(Palindrome.class);

    public boolean isPalindrome(String text){
        boolean notPalindrome = false;
        text = text.replaceAll("[^a-zA-Z]+","").toLowerCase();

        char[] array = text.toCharArray();
        for(int i=0, j=array.length-1; i<j; i++, j--) {
            if(array[i] != array[j]) {
                notPalindrome = true;
                break;
            }
        }
        log.info(text + " is palindrome? " + !notPalindrome);
        return !notPalindrome;
    }
}

