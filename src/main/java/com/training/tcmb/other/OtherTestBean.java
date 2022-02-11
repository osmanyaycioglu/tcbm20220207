package com.training.tcmb.other;

import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
// @DependsOn("echo")
public class OtherTestBean {

    public OtherTestBean() {
        System.out.println("OtherTestBean yaratıldı");
    }

    public String echo(String str){
        return "Echo : " + str;
    }
}

