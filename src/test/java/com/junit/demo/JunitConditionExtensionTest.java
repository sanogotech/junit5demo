package com.junit.demo;

import com.junit.demo.extension.DemoExecutionConditionExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(DemoExecutionConditionExtension.class)
class JunitConditionExtensionTest {

    @Test
    void test() {

    }
}
