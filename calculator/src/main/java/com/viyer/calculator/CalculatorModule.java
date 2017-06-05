package com.viyer.calculator;

/**
 * Created by vidya.iyer on 5/31/17.
 */
public class CalculatorModule extends AbstractModule {

    @Override
    public void configure() {
        bind(Calculate.class).to(CalculatorService.class);
    }
}
