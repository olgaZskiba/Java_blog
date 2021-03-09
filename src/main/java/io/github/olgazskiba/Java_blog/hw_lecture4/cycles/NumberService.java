package io.github.olgazskiba.Java_blog.hw_lecture4.cycles;

import org.apache.log4j.Logger;

/**
 * Разработать сервисный класс, который реализует два функциональных метода:
 * <p>
 * Рассчет суммы всех чисел в заданном интервале включительно.
 * Если начало интервала превышает конец, то необходимо выполнить расчет в обратном порядке.
 * Например, сумма чисел от 3 до 7 равна 3 + 4 + 5 + 6 + 7 = 25 и наоборот: 7 + 6 + 5 + 4 + 3 = 25.
 * <p>
 * Подсчет количества четных чисел в заданном интервале включительно.
 * Если начала интервала превышает конец, то необходимо выполнить расчет в обратном порядке.
 * Например, количество четных чисел в диапазоне от 2 до 9 равно 2, 4, 6, 8 => 4
 * и наоборот: 8, 6, 4, 2 => 4.
 * <p>
 * Оба метода должны быть реализованы используя циклы.
 * Логику необходимо реализовать в отдельном классе NumberService:
 */

public class NumberService {

    Logger log = Logger.getLogger(NumberService.class);

    public int rangeSum(int start, int finish) {
        int sum = 0;
        if (start < finish) {
            for (int i = start; i <= finish; i++)
                sum += i;
            log.info(sum);
        } else {
            for (int i = start; i >= finish; i--)
                sum += i;
        }
        log.info(sum);
        return sum;
    }

    public int rangeEvenCount(int start, int finish) {
        int count = 0;
        if (start < finish) {
            for (int i = start; i <= finish; i++)
                if (i % 2 == 0)
                    count++;
            log.info(count);
        } else {
            for (int i = start; i >= finish; i--)
                if (i % 2 == 0)
                    count++;
        }
        log.info(count);
        return count;
    }
}
