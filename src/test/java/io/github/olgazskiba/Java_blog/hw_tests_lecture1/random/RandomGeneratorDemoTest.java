package io.github.olgazskiba.Java_blog.random;

import io.github.olgazskiba.Java_blog.math_operations.MathOperationsDemo;
import org.junit.jupiter.api.Test;

import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class RandomGeneratorDemoTest {
    static Logger logger = LoggerFactory.getLogger(RandomGeneratorDemoTest.class);

    @Test
   void random() {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(10);
        assertEquals(randomNumber, RandomGeneratorDemo.random(randomNumber));
        int randomNumber2 = randomGenerator.nextInt();
        assertEquals(randomNumber2, RandomGeneratorDemo.random2(randomNumber2));
        int randomNumber3 = randomGenerator.nextInt(100);
        assertEquals(randomNumber3, RandomGeneratorDemo.random3(randomNumber3));
        logger.info("Random Number 1 = " + randomNumber);
        logger.info("Random Number 2 = " + randomNumber2);
        logger.info("Random Number 3 = " + randomNumber3);

        int randSum = randomNumber + randomNumber2 + randomNumber3;
        logger.info("Addition of Random Numbers = {} + {} + {} = {}", randomNumber, randomNumber2, randomNumber3, randSum);

    }

}