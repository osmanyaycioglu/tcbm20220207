package com.training.tcmb.other;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class OtherConfig {

    @Bean
    public Echo createEcho() {
        return new Echo();
    }

    @Bean
    @Lazy
    public OtherTestBean createOtherTestBean() {
        return new OtherTestBean();
    }

}
