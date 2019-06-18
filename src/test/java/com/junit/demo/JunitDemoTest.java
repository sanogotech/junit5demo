package com.junit.demo;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class JunitDemoTest {

    static long start = 0;

    @BeforeAll
    static void setup() {
        start = System.currentTimeMillis();
    }

    @AfterAll
    static void tearDown() {
        System.out.println("total time :"+ (System.currentTimeMillis() - start));
    }

    @ParameterizedTest(name = "should test {arguments} for even number")
    @ValueSource(strings = {"2", "4", "6", "14"})
    void testEvenNumber(int inputNumber) {
        Assertions.assertEquals(0, inputNumber % 2);
    }

    @DisplayName("should test even number")
    void testDisplayName() {
        //assertion here
    }

    @RepeatedTest(value = 10, name = "Should test even number {currentRepetition} of {totalRepetitions}")
    void testEvenNumber(RepetitionInfo repetitionInfo) {
        System.out.println(repetitionInfo.getCurrentRepetition());
        System.out.println(repetitionInfo.getTotalRepetitions());
        Assertions.assertEquals(0, 10 % 2);
    }
}
