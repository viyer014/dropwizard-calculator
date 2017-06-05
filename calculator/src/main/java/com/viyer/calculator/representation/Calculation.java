package com.viyer.calculator.representation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The representation class for the calculator application.
 * @author Vidya Iyer
 * @version 1.0
 * @since May 19, 2017
 */
public class Calculation {
    private String operation;
    private Double a;
    private Double b;
    private Double result;

    /**
     * A calculation is defined by the following parameters
     * @param operation How the values are going to be used together. Important to determine the
     *                  service that will be used
     * @param a The first variable
     * @param b The second variable
     * @param result The result formed by the operation performed on the two variables
     */
    public Calculation(String operation, Double a, Double b, Double result) {
        this.operation = operation;
        this.a = a;
        this.b = b;
        this.result = result;

    }

    @JsonProperty
    public String getOperation() {
        return operation;
    }

    @JsonProperty
    public Double getValueA() {
        return a;
    }

    @JsonProperty
    public Double getValueB() {
        return b;
    }

    @JsonProperty
    public Double getResult() {
        return result;
    }

}
