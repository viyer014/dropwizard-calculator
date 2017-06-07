package com.viyer.calculator;
import com.google.inject.Guice;
import com.google.inject.Injector;
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
        //CalculatorResource oldWay = new CalculatorResource(new CalculatorService(configuration));
        Injector injector = Guice.createInjector(new CalculatorModule(configuration));
        CalculatorResource resource = injector.getInstance(CalculatorResource.class);

        environment.jersey().register(resource);
    }
}
