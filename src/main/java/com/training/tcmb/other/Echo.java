package com.training.tcmb.other;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Echo {
    public String echo(String str){
        return "Echo : " + str;
    }
}
