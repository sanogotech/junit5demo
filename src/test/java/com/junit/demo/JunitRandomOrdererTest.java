package com.junit.demo;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.Random.class)
class JunitRandomOrdererTest {

    @Test
    void testC() {
    }

    @Test
    void testA() {
    }

    @Test
    void testB() {
    }
}
