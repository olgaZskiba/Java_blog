package io.github.olgazskiba.Java_blog.hw_lecture3.operators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LightColorDetectorTest {

    @Test
    void detect() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        assertEquals("Violet", lightColorDetector.detect(390));
        assertEquals("Blue", lightColorDetector.detect(460));
        assertEquals("Green", lightColorDetector.detect(520));
        assertEquals("Yellow", lightColorDetector.detect(580));
        assertEquals("Orange", lightColorDetector.detect(610));
        assertEquals("Red", lightColorDetector.detect(710));
        assertEquals("Invisible Light", lightColorDetector.detect(800));


    }
}