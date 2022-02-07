package com.training.tcmb.spring.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("eng-greet")
@Qualifier("grt-english")
// @Primary
@GreetingChooser(type = EGreetingType.ENGLISH)
public class Greeting implements IGreet {

    @Override
    public String greet(String name){
        return "Mreetings " + name;
    }

}
