package io.github.olgazskiba.Java_blog.hw_lecture4.cycles;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/*Разработать класс PrimeNumbers, который считает сумму простых чисел в диапазоне от 1 до 500 включительно.
 Дополнительно посчитайте количество простых чисел, которые входят в этот диапазон.

 Ограничения:

 Числа 17 и 71 не должны учитываться при подсчете суммы и количества простых чисел.
 В случае, если количество простых чисел равно 50, подсчет необходимо завершить досрочно.
 Для решения задачи используйте цикл for и операторы continue, break.

 Необходимо вывести на экран количество простых чисел и их сумму. */

public class PrimeNumbers {

    Logger log = Logger.getLogger(PrimeNumbers.class);

    public int primeNumbersSearch() {
        int sum = 0;
        int count = 0;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 2; i <= 500; i++) {
            if (checkSimple(i)) {
                if (count == 50) break;
                if (i == 17 || i == 71) continue;
                count++;
                sum += i;
                numbers.add(i);
            }
        }
        log.info("sum = " + sum);
        log.info("count = " + count);
        return sum;
    }


    public boolean checkSimple(int i) {
        if (i <= 1)
            return false;
        else if (i <= 3)
            return true;
        else if (i % 2 == 0 || i % 3 == 0)
            return false;
        int n = 5;
        while (n * n <= i) {
            if (i % n == 0 || i % (n + 2) == 0)
                return false;
            n = n + 6;
        }
        return true;
    }
}





