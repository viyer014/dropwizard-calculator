package com.viyer.calculator.resources;

import com.google.inject.Inject;
import com.viyer.calculator.CalculatorService;
import com.viyer.calculator.representation.Calculation;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by vidya.iyer on 5/22/17.
 */

@Path("/calculator")
@Produces(MediaType.APPLICATION_JSON)
public class CalculatorResource {

    CalculatorService calculator;


    @Inject
    public CalculatorResource(CalculatorService calculator) {
        this.calculator = calculator;
    }


    @GET
    @Path("/add")
    public Calculation addValues(@QueryParam("a") Double a, @QueryParam("b") Double b) {
        return new Calculation("add", a, b, calculator.calculate("add", a, b));
    }

    @GET
    @Path("/subtract")
    public Calculation subValues(@QueryParam("a") Double a, @QueryParam("b") Double b) {
        return new Calculation("subtract", a, b, calculator.calculate("subtract", a, b));
    }

    @GET
    @Path("/multiply")
    public Calculation multiplyValues(@QueryParam("a") Double a, @QueryParam("b") Double b) {
        return new Calculation("multiply", a, b, calculator.calculate("multiply", a, b));
    }

    @GET
    @Path("/divide")
    public Calculation divideValues(@QueryParam("a") Double a, @QueryParam("b") Double b) {
        return new Calculation("divide", a, b, calculator.calculate("divide", a, b));
    }
}


