package com.training.tcmb.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class DivOperation {

    public int process(int ival1,
                       int ival2) {
        return ival1 / ival2;
    }

    public Integer divide(Integer integer1,
                          Integer integer2) {
        if (integer1 == null) {
            return 0;
        }
        if (integer2 == null) {
            throw new ArithmeticException();
        }
        return integer1 / integer2;
    }

}
