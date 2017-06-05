package com.viyer.calculator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

/**
 * Created by vidya.iyer on 5/19/17.
 */
public class CalculatorConfiguration extends Configuration {

    public Double defaultValue = 0.0;

    @JsonProperty
    public Double getDefaultValue() {
        return defaultValue;
    }

}
