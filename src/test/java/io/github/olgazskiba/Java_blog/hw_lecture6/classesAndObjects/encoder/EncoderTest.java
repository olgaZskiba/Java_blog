package io.github.olgazskiba.Java_blog.hw_lecture6.classesAndObjects.encoder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncoderTest {

    @Test
    void encode() {
        Encoder encoder = new Encoder();
        char expected = 'A';
        char actual = encoder.encode((short) 65);
        assertEquals(expected, actual);
    }

    @Test
    void decode() {
        Encoder encoder = new Encoder();
        int expected = 88;
        int actual = encoder.decode('X');
        assertEquals(expected,actual);

    }
}