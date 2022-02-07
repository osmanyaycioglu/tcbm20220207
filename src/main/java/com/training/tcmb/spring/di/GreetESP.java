package com.training.tcmb.spring.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class GreetESP implements IGreet{

    @Override
    public String greet(String name) {
        return "Ola "  + name;
    }
}
