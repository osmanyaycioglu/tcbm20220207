package com.training.tcmb.spring.java;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
//@Scope("singleton")
public class Hello {

    private int counter = 0;

    public String hello(String name) {
        counter++;
        System.out.println("Counter : " + counter);
        return "Hello " + name;
    }

}
