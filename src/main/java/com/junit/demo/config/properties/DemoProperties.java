package com.junit.demo.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "demo")
public class DemoProperties {

    private String backendUrl;

    public void setBackendUrl(String backendUrl) {
        this.backendUrl = backendUrl;
    }

    public String getBackendUrl() {
        return backendUrl;
    }
}
