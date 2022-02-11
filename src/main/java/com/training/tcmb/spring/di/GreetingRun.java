package com.training.tcmb.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class GreetingRun implements CommandLineRunner {

    @Autowired
    @Qualifier("currentGreeting")
    // @GreetingChooser(type = EGreetingType.ENGLISH)
    private IGreet greet;

    @Autowired
    private GreetingProperties gp;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(gp);
        System.out.println(greet.greet("ali"));
    }
}
