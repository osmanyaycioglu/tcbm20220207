package com.training.tcmb.spring.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class GreetingDyn implements IGreet {

    private String prefix;

    public GreetingDyn(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public String greet(String name) {
        return prefix + " " + name;
    }

}
