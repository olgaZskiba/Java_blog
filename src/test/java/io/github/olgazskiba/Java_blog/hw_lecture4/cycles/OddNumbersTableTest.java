package io.github.olgazskiba.Java_blog.hw_lecture4.cycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddNumbersTableTest {

    OddNumbersTable oddNumbersTable = new OddNumbersTable();

    @Test
    void forOddChecker() {
        oddNumbersTable.forOddChecker();

    }

    @Test
    void whileOddChecker() {
        oddNumbersTable.whileOddChecker();
    }

    @Test
    void doWhileOddChecker() {
        oddNumbersTable.doWhileOddChecker();
    }
}