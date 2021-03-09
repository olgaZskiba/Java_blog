package io.github.olgazskiba.Java_blog.hw_lecture4.cycles;

import org.apache.log4j.Logger;

/**
 * Разработать класс PowerCalculator, который реализует единственный функциональный метод
 * для возведения заданного числа в заданную степень. Математическую операцию реализовать с использованием цикла.
 * <p>
 * Метод должен работать только с положительными числами.
 */

public class PowerCalculator {

    Logger log = Logger.getLogger(PowerCalculator.class);

    public int degreeOfNumber(int number, int degree) {
        int result = 1;
        if (number > 0) {
            for (int i = 1; i <= degree; i++)
                result = result * number;
        } else if (degree == 0) {
            result = 1;
        }
        log.info(result);
        return result;
    }


    public int recursion(int number, int degree) {
        int result;
        if (degree == 1) {
            log.info(number);
            return number;
        } else {
            result = number * recursion(number, degree - 1);
            log.info(result);
            return result;
        }
    }

}
