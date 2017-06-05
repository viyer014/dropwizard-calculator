package com.viyer.calculator;
import com.viyer.calculator.resources.CalculatorResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Created by vidya.iyer on 5/19/17.
 */
public class CalculatorApplication extends Application<CalculatorConfiguration> {
    public static void main(String[] args) throws Exception {
        new CalculatorApplication().run(args);

    }

    @Override
    public void initialize(Bootstrap<CalculatorConfiguration> bootstrap) {

    }

    @Override
    public void run(CalculatorConfiguration configuration,
                    Environment environment) {
        Injector inject = Guice.createInjector(new CalculatorModule());
        CalculatorResource resource = new CalculatorResource();
        // nothing to do yet
        environment.jersey().register(resource);
    }
}
