package com.viyer.calculator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import io.dropwizard.Configuration;

/**
 * Created by vidya.iyer on 5/19/17.
 */

public class CalculatorConfiguration extends Configuration {

    @Inject
    public Double defaultValue;


    @JsonProperty
    public Double getDefaultValue() {
        return defaultValue;
    }

}
