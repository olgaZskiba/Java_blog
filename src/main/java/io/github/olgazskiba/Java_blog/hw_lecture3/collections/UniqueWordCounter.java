package io.github.olgazskiba.Java_blog.hw_lecture3.collections;
/*Необходимо разработать класс UniqueWordCounter, который в качестве коллекции использует Map.
Данный класс должен выполнять следующие задачи:

void addWord(String word) - добавляет строку и считает количество раз, которое она была добавлена;
int getMostFrequentWord() - возвращает строку, которая была добавлена чаще всего;
void printWordsFrequency() - печатает на экран содержимое коллекции, а также количество раз,
которое слово было добавлено;*/

import io.github.olgazskiba.Java_blog.hw_lecture3.operators.SignComparator;
import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class UniqueWordCounter {

    public Logger log = Logger.getLogger(SignComparator.class);

    public Map<String, Integer> counterString = new HashMap<>();

    public void addWord(String word){
        Integer frequency = counterString.get(word);
        counterString.put(word, frequency == null ? 1 : frequency + 1);
        log.info(counterString.entrySet());
    }

    public int getMostFrequentWord() {
        String wordMax = null;
        Integer frequencyMax = 0;
        for (Map.Entry<String, Integer> entry : counterString.entrySet()) {
            String word = entry.getKey();
            Integer frequency = entry.getValue();
            if (frequency > frequencyMax) {
                wordMax = word;
                frequencyMax = frequency;
            }
        }
        log.info("Word: " + wordMax + " Frequency: " + frequencyMax);
        return frequencyMax;
    }

    public void printWordsFrequency(){
        for (Map.Entry<String, Integer> entry : counterString.entrySet())
        log.info("Word: " + entry.getKey() + " Frequency: "
                + entry.getValue());
    }
}


