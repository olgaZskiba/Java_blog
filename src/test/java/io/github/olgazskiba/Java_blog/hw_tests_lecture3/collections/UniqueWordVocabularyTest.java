package io.github.olgazskiba.Java_blog.hw_tests_lecture3.collections;


import io.github.olgazskiba.Java_blog.hw_lecture3.collections.UniqueWordVocabulary;
import io.github.olgazskiba.Java_blog.hw_lecture3.operators.SignComparator;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


class UniqueWordVocabularyTest {

    public Logger log = Logger.getLogger(SignComparator.class);

    UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();

    @BeforeEach
    public void allSet(){
        uniqueWordVocabulary.addWord("aple");
        uniqueWordVocabulary.addWord("ball");
        uniqueWordVocabulary.addWord("cake");
        uniqueWordVocabulary.addWord("doll");
        uniqueWordVocabulary.addWord(null);
    }

    @Test
    void addWord() {
        assertEquals(4, uniqueWordVocabulary.vocabulary.size());
        uniqueWordVocabulary.addWord(null);

        assertEquals(4, uniqueWordVocabulary.vocabulary.size());
        uniqueWordVocabulary.addWord("doll");
        assertEquals(4, uniqueWordVocabulary.vocabulary.size());
        uniqueWordVocabulary.addWord("eagle");
        assertEquals(5, uniqueWordVocabulary.vocabulary.size());
        uniqueWordVocabulary.addWord(null);
        assertEquals(5, uniqueWordVocabulary.vocabulary.size());

        }

    @Test
    void getWordsCount() {
        assertEquals(4, uniqueWordVocabulary.getWordsCount());
        log.info(uniqueWordVocabulary.getWordsCount());
        assertNotEquals(5, uniqueWordVocabulary.getWordsCount());
    }

    @Test
    void printVocabulary() {
        uniqueWordVocabulary.printVocabulary();
    }
}