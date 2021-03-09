package io.github.olgazskiba.Java_blog.hw_lecture4.cycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerCalculatorTest {

    PowerCalculator powerCalculator = new PowerCalculator();

    @Test
    void degreeOfNumber() {
        int exp = 8;
        int act = powerCalculator.degreeOfNumber(2, 3);
        assertEquals(exp, act);
        int exp1 = 1;
        int act1 = powerCalculator.degreeOfNumber(2, 0);
        assertEquals(exp1, act1);
    }

    @Test
    void recursion() {
        int exp = 27;
        int act = powerCalculator.recursion(3, 3);
        assertEquals(exp, act);
    }
}