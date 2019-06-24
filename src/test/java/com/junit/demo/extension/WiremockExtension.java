package com.junit.demo.extension;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.core.Options;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import org.junit.jupiter.api.extension.*;

public class WiremockExtension extends WireMockServer implements AfterAllCallback, BeforeAllCallback,
        AfterEachCallback {

    public WiremockExtension() {
        this(WireMockConfiguration.wireMockConfig().port(4545));
    }

    public WiremockExtension(Options options) {
        super(options);
    }

    public WiremockExtension(int port) {
        this(WireMockConfiguration.wireMockConfig().port(port));
    }

    public WiremockExtension(int port, Integer httpsPort) {
        this(WireMockConfiguration.wireMockConfig().port(port).httpsPort(httpsPort));
    }

    @Override
    public void afterEach(ExtensionContext extensionContext) throws Exception {
        WireMock.reset();
    }

    @Override
    public void beforeAll(ExtensionContext extensionContext) throws Exception {
        this.start();
        WireMock.configureFor("localhost", WiremockExtension.this.port());
    }

    @Override
    public void afterAll(ExtensionContext extensionContext) throws Exception {
        this.stop();
    }
}
