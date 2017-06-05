package com.viyer.calculator.resources;

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

    public CalculatorResource() {

    }

    /*
    @GET
    @Timed
    public Calculation decideService(@QueryParam("operation") String operation, @QueryParam("a") Double a, @QueryParam("b") Double b) {
        switch (operation) {
            case("add"):
                AdditionService addValues = new AdditionService();
                return addValues.calculate(a, b);
            case("subtract"):

                SubtractionService subtractValues = new SubtractionService();
                return subtractValues.calculate(a, b);

            case("multiply"):
                MultiplicationService multiplyValues = new MultiplicationService();
                return multiplyValues.calculate(a, b);

            case("divide"):
                DivisionService divideValues = new DivisionService();
                return divideValues.calculate(a, b);

            default: throw new IllegalArgumentException("Operation requested is unavailable");


        }

    }
    */

    CalculatorService calculator = new CalculatorService();

    @Inject
    @GET
    @Path("/add")
    public Calculation addValues(@QueryParam("a") Double a, @QueryParam("b") Double b) {
        return new Calculation("add", a, b, calculator.calculate("add", a, b));
    }

    @Inject
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


