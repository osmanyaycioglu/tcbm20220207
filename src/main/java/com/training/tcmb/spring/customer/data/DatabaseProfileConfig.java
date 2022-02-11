package com.training.tcmb.spring.customer.data;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("database")
public class DatabaseProfileConfig {

    @Bean
    public ICustomerData customerData() {
        return new CustomerDB();
    }

}
