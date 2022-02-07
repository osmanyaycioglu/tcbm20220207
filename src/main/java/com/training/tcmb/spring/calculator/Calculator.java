package com.training.tcmb.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private AddOperation addOperation;
    @Autowired
    private SubsOperation subsOperation;
    @Autowired
    private MultOperation multOperation;
    @Autowired
    private DivOperation divOperation;

    public int calculate(int opIndex,int ival1,int ival2){
        switch (opIndex){
            case 1:
                return addOperation.process(ival1,ival2);
            case 2:
                return subsOperation.process(ival1,ival2);
            case 3:
                return multOperation.process(ival1,ival2);
            case 4:
                return divOperation.process(ival1,ival2);
            default:
                return addOperation.process(ival1,ival2);
        }
    }

}
