package io.github.olgazskiba.Java_blog.hw_lecture3.operators.collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueWordCounterTest {

    UniqueWordCounter uniqueWordCounter = new UniqueWordCounter();

    @BeforeEach
        public void setUp() {
        uniqueWordCounter.addWord("a");
        uniqueWordCounter.addWord("b");
        uniqueWordCounter.addWord("c");
        uniqueWordCounter.addWord("d");

    }


    @Test
    void addWord() {
        uniqueWordCounter.addWord("c");
        uniqueWordCounter.addWord("d");
        assertEquals(1, uniqueWordCounter.counterString.get("a"));
        assertEquals(2, uniqueWordCounter.counterString.get("d"));
        assertEquals(4, uniqueWordCounter.counterString.size());

    }

    @Test
    void getMostFrequentWord() {
        uniqueWordCounter.addWord("c");
        uniqueWordCounter.addWord("d");
        uniqueWordCounter.addWord("d");
        uniqueWordCounter.addWord("d");
        assertEquals(4, uniqueWordCounter.getMostFrequentWord());

    }

    @Test
    void printWordsFrequency() {
        uniqueWordCounter.printWordsFrequency();
    }
}