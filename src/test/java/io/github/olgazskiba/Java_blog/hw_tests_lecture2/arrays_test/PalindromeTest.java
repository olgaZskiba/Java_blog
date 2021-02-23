package io.github.olgazskiba.Java_blog.hw_tests_lecture2.arrays_test;

import io.github.olgazskiba.Java_blog.hw_lecture2.arrays.Palindrome;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    public Logger log = Logger.getLogger(PalindromeTest.class);

    @Test
    void isPalindrome() {
        Palindrome palindrome = new Palindrome();
        String text = "Doc, note, I dissent. A fast never prevents a fatness. I diet on cod";
        palindrome.isPalindrome(text);
        assertEquals(true, palindrome.isPalindrome(text));
    }
}
