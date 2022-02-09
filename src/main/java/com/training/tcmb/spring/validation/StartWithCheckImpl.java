package com.training.tcmb.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class StartWithCheckImpl implements ConstraintValidator<StartWith,String> {

    private StartWith anno;

    @Override
    public void initialize(StartWith anno) {
        this.anno = anno;
    }

    @Override
    public boolean isValid(String value,
                           ConstraintValidatorContext context) {
        return value.startsWith(anno.value());
    }

}
