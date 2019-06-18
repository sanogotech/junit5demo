package com.junit.demo;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
class JunitAlphanumericOrdererTest {

    @Test
    void testA() {
    }

    @ParameterizedTest
    @CsvSource({"a, b", "b, c"})
    void testC(String testa, String testb) {
    }

    @ParameterizedTest
    @CsvSource({"a, 1", "b, 1"})
    void testC(String testa, Integer testb) {
    }

}
