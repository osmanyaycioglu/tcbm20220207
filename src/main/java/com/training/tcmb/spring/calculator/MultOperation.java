package com.training.tcmb.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class MultOperation {

    public int process(int ival1,int ival2){
        return ival1 * ival2;
    }

}
