package io.github.olgazskiba.Java_blog.hw_lecture3.operators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SignComparatorTest {

    @Test
    void compare() {
        SignComparator signComparator = new SignComparator();
        signComparator.compare(1);
        assertEquals("Number is positive", signComparator.compare(1));
    }
}