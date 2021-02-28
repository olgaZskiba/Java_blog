package io.github.olgazskiba.Java_blog.hw_lecture3.operators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhraseAnalyserTest {

    @Test
    void analyse() {
        PhraseAnalyser phraseAnalyser = new PhraseAnalyser();
        assertEquals("It stands no chance", phraseAnalyser.analyse("Make and not make and great again"));
        assertEquals("It could be worse", phraseAnalyser.analyse( "Make and not make"));
        assertEquals("It is fine, really", phraseAnalyser.analyse( "And not make"));

    }
}