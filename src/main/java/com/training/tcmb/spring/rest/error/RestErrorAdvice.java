package com.training.tcmb.spring.rest.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.List;
import java.util.Set;

@RestControllerAdvice
public class RestErrorAdvice {

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public RestError handleException(IllegalArgumentException exp) {
        return RestError.create()
                        .setMessage(exp.getMessage())
                        .setErrorCause(10002L);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public RestError handleException(MethodArgumentNotValidException exp) {
        RestError rootError = RestError.create()
                                       .setMessage("Validasyon problemi")
                                       .setErrorCause(20012L);
        List<ObjectError> allErrors = exp.getAllErrors();
        for (ObjectError item : allErrors) {
            rootError.addSubError(RestError.create()
                                           .setMessage(item.toString())
                                           .setErrorCause(20_012L));
        }
        return rootError;
    }

    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public RestError handleException(ConstraintViolationException exp) {
        RestError rootError = RestError.create()
                                       .setMessage("Validasyon problemi")
                                       .setErrorCause(20014L);
        Set<ConstraintViolation<?>> allErrors = exp.getConstraintViolations();
        for (ConstraintViolation<?> item : allErrors) {
            rootError.addSubError(RestError.create()
                                           .setMessage(item.toString())
                                           .setErrorCause(20015L));
        }
        return rootError;
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<RestError> handleException(Exception exp) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                             .body(RestError.create()
                                            .setMessage(exp.getMessage())
                                            .setErrorCause(10004L));
    }

}
