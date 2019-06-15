package com.junit.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class JunitDemoTest {

    @ParameterizedTest(name = "should test {arguments} for even number")
    @ValueSource(strings = {"2", "4", "6", "14"})
    void testEvenNumber(int inputNumber) {
        Assertions.assertTrue(inputNumber % 2 == 0);
    }
}
