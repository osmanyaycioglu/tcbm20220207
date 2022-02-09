package com.training.tcmb.spring.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
@Retention(RUNTIME)
@Constraint(validatedBy = {StartWithCheckImpl.class})
public @interface StartWith {
    String value();

    // String testOp() default "";

    String message() default "String {value} ile başlamalı.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
