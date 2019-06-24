package com.junit.demo.config;

import com.junit.demo.config.properties.DemoProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@EnableConfigurationProperties(DemoProperties.class)
public class DemoConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
