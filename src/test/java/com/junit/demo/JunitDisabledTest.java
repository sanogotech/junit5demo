package com.junit.demo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("disabled until feature is available") //class level
public class JunitDisabledTest {

    @Disabled("disable until feature is available") // method level
    @Test
    void testDisable() {
        // code assertion here
    }
}
