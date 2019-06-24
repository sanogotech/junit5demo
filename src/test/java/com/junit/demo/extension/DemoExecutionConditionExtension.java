package com.junit.demo.extension;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.util.Optional;

public class DemoExecutionConditionExtension implements ExecutionCondition {
    @Override
    public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext extensionContext) {
        String env = System.getProperty("env");
        return Optional.ofNullable(env)
                .filter(s -> !s.equalsIgnoreCase("dev"))
                .map(s -> ConditionEvaluationResult.enabled("enabled for env "+env))
                .orElse(ConditionEvaluationResult.disabled("disabled for env " + env));
    }
}
