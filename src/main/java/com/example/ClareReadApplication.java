package com.example;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;

public class ClareReadApplication extends Application<ClareReadConfiguration> {

    public static void main(String[] args) throws Exception {
        new ClareReadApplication().run(args);
    }

    @Override
    public void run(ClareReadConfiguration clareReadConfiguration, Environment environment) throws Exception {
        environment.jersey().register(new ClareReadResource());
    }

    @Override
    public void initialize(Bootstrap<ClareReadConfiguration> bootstrap) {
        bootstrap.addBundle(new ViewBundle<ClareReadConfiguration>());
    }
}
