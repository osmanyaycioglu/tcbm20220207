package com.training.tcmb.spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//@Controller
//@Repository
//@Service
@Configuration
public class GreetingConfig {

    @Bean
    public IGreet createGreet() {
        return new GreetTR();
    }

    @Bean
    public IGreet createGreet2() {
        return new GreetESP();
    }

}
