package com.viyer.calculator;

import com.google.inject.Inject;
import io.dropwizard.Configuration;

import javax.annotation.Nullable;

/**
 * Created by vidya.iyer on 5/26/17.
 */
public class CalculatorService implements Calculate{

    CalculatorConfiguration config;

    @Inject
    public CalculatorService(CalculatorConfiguration config) {
        this.config = config;
    }

    @Nullable
    public Double calculate(String operation, Double a, Double b) {
        if (a == null) {
            a = config.getDefaultValue();
        }

        if (b == null) {
            b = config.getDefaultValue();
        }

        switch (operation) {
            case("add"):
                return a + b;
            case("subtract"):
                return a - b;
            case("multiply"):
                return a * b;
            case("divide"):
                return a / b;
            default: throw new IllegalArgumentException("Operation requested is unavailable");


        }
    }

}
