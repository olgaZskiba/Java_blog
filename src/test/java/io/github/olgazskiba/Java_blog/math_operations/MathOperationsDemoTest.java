package io.github.olgazskiba.Java_blog.math_operations;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class MathOperationsDemoTest {

    static Logger logger = LoggerFactory.getLogger(MathOperationsDemoTest.class);

    int a = 9;
    int b = 3;

    @Test
    void add() {
        logger.info("Welcome to the 'Math Operations'!");
        int result = a + b;
        assertEquals(result, MathOperationsDemo.add(a, b));
        logger.info("1) Addition '+':");
        logger.info("a = " + a + ", b = " + b);
        logger.info("a + b = {} + {} = {}", a, b, result);

    }

    @Test
    void sub() {
        logger.info("2) Subtraction '-':");
        int result = a - b;
        assertEquals(result, MathOperationsDemo.sub(a, b));
        logger.info("a = " + a + ", b = " + b);
        logger.info("a - b = {} - {} = {}", a, b, result);
    }

    @Test
    void mult() {
        logger.info("3) Multiplication '*':");
        int result = a * b;
        assertEquals(result, MathOperationsDemo.mult(a, b));
        logger.info("a = " + a + ", b = " + b);
        logger.info("a * b = {} * {} = {}", a, b, result);
    }

    @Test
    void div() {
        logger.info("4) Division '/':");
        int result = a / b;
        assertEquals(result, MathOperationsDemo.div(a, b));
        logger.info("a = " + a + ", b = " + b);
        logger.info("a / b = {} / {} = {}", a, b, result);

    }
}