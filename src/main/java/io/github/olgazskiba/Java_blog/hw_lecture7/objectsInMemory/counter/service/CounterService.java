package io.github.olgazskiba.Java_blog.hw_lecture7.objectsInMemory.counter.service;

import io.github.olgazskiba.Java_blog.hw_lecture7.objectsInMemory.counter.bean.Counter;
import org.apache.log4j.Logger;

public class CounterService {

    Logger log = Logger.getLogger(CounterService.class);

    private final Counter counter;

    public CounterService(Counter counter) {
        this.counter = counter;
    }

    public void increment() {
        int result = counter.getValue() + counter.getStep();
        if (result <= 100) {
            counter.setValue(result);
            log.info(result);
        }
        if (result > 100) {
            log.info("Result is over 100");
            return;
        }
    }

    public void decrement() {
        int result = counter.getValue() - counter.getStep();
        if (result >= 0) {
            counter.setValue(result);
            log.info(result);
        }
        if (result < 0) {
            log.info("Result is 0");
            return;
        }
    }

    public void clear() {
        counter.setValue(0);
        counter.setStep(1);
    }

    public void setValue(int value) {
        if (value >= 0 && value <= 100) {
            counter.setValue(value);
            log.info("New value = " + counter.getValue());
        } else
            log.info("New value not set");
    }

    public int getValue() {
        log.info("Present value = " + counter.getValue());
        return counter.getValue();
    }

    public void setStep(int step) {
        if (step > 0 && step <= 10) {
            counter.setStep(step);
            log.info("New step = " + counter.getStep());
        } else
            log.info("New step not set");
    }

    public int getStep() {
        log.info("Present step = " + counter.getStep());
        return counter.getStep();
    }
}

