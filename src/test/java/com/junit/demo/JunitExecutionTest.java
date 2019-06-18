package com.junit.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(ExecutionMode.CONCURRENT)
class JunitExecutionTest {

    @Test
    void test1() {
        System.out.println(Thread.currentThread().getName() + " : test1 :");
    }

    @Test
    void test2() {
        System.out.println(Thread.currentThread().getName() + " : test2 :");
    }
}
