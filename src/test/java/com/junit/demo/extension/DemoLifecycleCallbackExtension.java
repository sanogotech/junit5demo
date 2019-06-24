package com.junit.demo.extension;

import org.junit.jupiter.api.extension.*;

public class DemoLifecycleCallbackExtension implements BeforeAllCallback, AfterAllCallback,
        BeforeEachCallback, AfterEachCallback, BeforeTestExecutionCallback, AfterTestExecutionCallback {

    @Override
    public void afterAll(ExtensionContext extensionContext) throws Exception {
        System.out.println("afterAll extension");
    }

    @Override
    public void afterEach(ExtensionContext extensionContext) throws Exception {
        System.out.println("afterEach extension");
    }

    @Override
    public void afterTestExecution(ExtensionContext extensionContext) throws Exception {
        System.out.println("afterTestExecution extension");
    }

    @Override
    public void beforeAll(ExtensionContext extensionContext) throws Exception {
        System.out.println("beforeAll extension");
    }

    @Override
    public void beforeEach(ExtensionContext extensionContext) throws Exception {
        System.out.println("beforeEach extension");
    }

    @Override
    public void beforeTestExecution(ExtensionContext extensionContext) throws Exception {
        System.out.println("beforeTestExecution extension");
    }
}
