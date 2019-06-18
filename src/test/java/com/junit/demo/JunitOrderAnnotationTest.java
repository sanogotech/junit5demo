package com.junit.demo;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class JunitOrderAnnotationTest {

    @Test
    @Order(2)
    void testC() {

    }

    @Test
    @Order(1)
    void testA() {

    }

    @Test
    void testB() {

    }

}
