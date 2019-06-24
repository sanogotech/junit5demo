package com.junit.demo.api;

import com.jayway.restassured.RestAssured;
import com.junit.demo.JunitApplication;
import com.junit.demo.extension.WiremockExtension;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

@ExtendWith(WiremockExtension.class)
@SpringBootTest(classes = {JunitApplication.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoApiIT {

    @BeforeEach
    void setup(@LocalServerPort int port) {
        RestAssured.basePath = "/demo";
        RestAssured.port = port;
    }

    @Test
    void testUserApi() {
        stubFor(get(urlPathMatching("/users/.*"))
                .willReturn(
                        aResponse()
                                .withStatus(200)
                                .withHeader("content-type", "application/json")
                                .withBodyFile("UserResponse.json")
                )

        );

        RestAssured
                .get("/{userId}", "testId")
                .then()
                .assertThat()
                .statusCode(200)
                .body(Matchers.containsString("testUser"));

        verify(exactly(1), getRequestedFor(urlPathMatching("/users/.*")));
    }

    @Test
    void testUserApi1() {
        stubFor(get(urlPathMatching("/users/.*"))
                .willReturn(
                        aResponse()
                                .withStatus(200)
                                .withHeader("content-type", "application/json")
                                .withBodyFile("UserResponse.json")
                )

        );

        RestAssured
                .get("/{userId}", "testId")
                .then()
                .assertThat()
                .statusCode(200)
                .body(Matchers.containsString("testUser"));

        verify(exactly(1), getRequestedFor(urlPathMatching("/users/.*")));
    }

}