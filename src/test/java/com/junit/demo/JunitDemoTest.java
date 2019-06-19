package com.junit.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class JunitDemoTest {

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
