package com.viyer.calculator;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;


/**
 * Created by vidya.iyer on 5/31/17.
 */
public class CalculatorModule extends AbstractModule {

    private CalculatorConfiguration config;

    public CalculatorModule(CalculatorConfiguration config) {
        this.config = config;
    }

    @Override
    public void configure() {
        bind(Calculate.class).to(CalculatorService.class);
    }

    @Provides
    CalculatorConfiguration provideCalcConfig() {
        return config;
    }
}
