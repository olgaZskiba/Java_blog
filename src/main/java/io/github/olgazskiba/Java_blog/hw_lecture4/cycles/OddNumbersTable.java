package io.github.olgazskiba.Java_blog.hw_lecture4.cycles;

import org.apache.log4j.Logger;

/*Разработать классы ForOddChecker, WhileOddChecker и DoWhileOddChecker,
  каждый из котороых выводит на экран нечетные числа в диапазоне от 0 до 50 включительно
  используя цикл, который соответствует названию класса (for, while, и do .. while).*/

public class OddNumbersTable {

    Logger log = Logger.getLogger(OddNumbersTable.class);

    public void forOddChecker() {
        for (int i = 0; i <= 50; i++) {
            if (i % 2 != 0)
                log.info(i);
        }
    }

    public void whileOddChecker() {
        int i = 0;
        while (i <= 50) {
            if (i % 2 != 0)
                log.info(i);
            i++;
        }
    }

    public void doWhileOddChecker() {
        int i = 0;
        do {
            i++;
            if (i % 2 != 0)
                System.out.println(i);
        }
        while (i < 50);
    }
}
