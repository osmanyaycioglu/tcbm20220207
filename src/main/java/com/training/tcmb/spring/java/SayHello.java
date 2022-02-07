package com.training.tcmb.spring.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SayHello {

    @Autowired
    private Hello hello1;
    @Autowired
    private Hello hello2;
    @Autowired
    private Hello hello3;
    @Autowired
    private Hello hello4;
    @Autowired
    private Hello hello5;
    @Autowired
    private Hello hello6;

    @Autowired
    public SayHello(final Hello hello) {
        // this.hello = hello;
    }

//    public SayHello() {
//    }

    // @Autowired
//    public void xyz(Hello hello) {
//        this.hello = hello;
//    }

    public void sayIt(String name) {
        System.out.println(hello1.hello(name));
        System.out.println(hello2.hello(name));
        System.out.println(hello3.hello(name));
        System.out.println(hello4.hello(name));
        System.out.println(hello5.hello(name));
        System.out.println(hello6.hello(name));
    }

}

