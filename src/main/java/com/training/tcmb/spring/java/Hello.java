package com.training.tcmb.spring.java;

import org.springframework.stereotype.Component;

@Component
public class Hello {

    public String hello(String name){
        return "Hello " + name;
    }

}
