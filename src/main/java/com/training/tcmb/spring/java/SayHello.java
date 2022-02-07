package com.training.tcmb.spring.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SayHello {

    // @Autowired
    private final Hello hello ;

    @Autowired
    public SayHello(final Hello hello){
        this.hello = hello;
    }

//    public SayHello() {
//    }

    // @Autowired
//    public void xyz(Hello hello) {
//        this.hello = hello;
//    }

    public void sayIt(String name) {
        System.out.println(hello.hello(name));
    }

}

