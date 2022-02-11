package com.training.tcmb.spring.di;

import com.training.tcmb.spring.java.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

//@Controller
//@Repository
//@Service
@Configuration
public class GreetingConfig {

    // 1
    @Autowired
    private ApplicationContext ac;
    // 2
    @Autowired
    private Environment env;
    // 3
//    @Value("${greeting.prefix}")
//    private String prefix;

    // 4
    @Autowired
    private GreetingProperties greetingProperties;

    @Bean
    //@Profile("database")
    public IGreet createGreet(@Value("${greeting.prefix}") String prefix,
                              Hello hello) {
        GreetingProperties bean = ac.getBean(GreetingProperties.class);
        // 1
        //        Environment environment = ac.getEnvironment();
        //        String prefix = environment.getProperty("greeting.prefix");
        // 2
        // String prefix = env.getProperty("greeting.prefix");
        // 3
        // prefix
        return new GreetingDyn(greetingProperties.getStartWith());
    }

    @Bean
    public IGreet currentGreeting() {
        EGreetingType greetingType = greetingProperties.getGreetingType();
        switch (greetingType){
            case TURKISH:
                return new GreetTR();
            case SPANISH:
                return new GreetESP();
            case CUSTOM:
                return new GreetingDyn(greetingProperties.getCustomGreeting());
            case ENGLISH:
            default:
                return new Greeting();
        }
    }

}
