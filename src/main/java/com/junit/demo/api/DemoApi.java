package com.junit.demo.api;

import com.junit.demo.config.properties.DemoProperties;
import com.junit.demo.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoApi {

    private final RestTemplate restTemplate;
    private DemoProperties demoProperties;

    public DemoApi(RestTemplate restTemplate, DemoProperties demoProperties) {
        this.restTemplate = restTemplate;
        this.demoProperties = demoProperties;
    }

    @GetMapping("/demo/{userId}")
    public ResponseEntity<User> getUserDetails(@PathVariable String userId) {
        User user = restTemplate.getForObject(demoProperties.getBackendUrl() + "{userId}", User.class, userId);
        return ResponseEntity.ok(user);
    }
}
