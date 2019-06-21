package com.junit.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

@Tag("tag-demo")
class JunitAnnotationsTest {

    @Test
    void shouldTestForSuccess() {
        Assertions.assertEquals(0, 6 % 2);
    }

    @Test
    void testTimeout() {
        assertTimeout(Duration.ofSeconds(2), () -> {
            // make api call to verify performance
        });
    }

    @Test
    void testPreemptiveTimeout() {
        assertTimeoutPreemptively(Duration.ofSeconds(1), () -> {
            // make api call to verify performance
            Thread.sleep(1500);
            System.out.println("done");
        });
    }

    @Test
    @EnabledOnOs(OS.MAC)
    void shouldRunOnMac() {

    }

    @Test
    @DisabledOnOs(OS.MAC)
    void shouldNotRunOnMac() {

    }

    @Test
    @EnabledIfSystemProperty(named = "env", matches = "true")
    void shouldRunOnlyForSystemProperty() {

    }

    @Test
    @DisabledIfSystemProperty(named = "env", matches = "false")
    void shouldNotRunForSystemProperty() {

    }

    @Test
    @Tag("slow")
    void tagTestSlow() {}

    @Test
    @Tag("very-slow")
    void tagTestVerySlow() {}

    @SlowTest
    void tagCustomAnnotationTest() {}
}
