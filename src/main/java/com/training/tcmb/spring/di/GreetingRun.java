package com.training.tcmb.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class GreetingRun implements CommandLineRunner {

    @Autowired
    @Qualifier("createGreet")
    // @GreetingChooser(type = EGreetingType.ENGLISH)
    private IGreet greet;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(greet.greet("ali"));
    }
}
