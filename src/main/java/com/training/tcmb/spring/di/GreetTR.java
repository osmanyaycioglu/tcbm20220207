package com.training.tcmb.spring.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("grt-turkish")
@GreetingChooser(type = EGreetingType.TURKISH)
public class GreetTR implements IGreet{

    @Override
    public String greet(String name) {
        return "Selam "  + name;
    }
}
