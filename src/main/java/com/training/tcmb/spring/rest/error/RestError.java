package com.training.tcmb.spring.rest.error;

import java.util.ArrayList;
import java.util.List;

public class RestError {
    private List<RestError> subErrors;
    private String message;
    private Long errorCause;

    public static RestError create() {
        return new RestError();
    }

    public RestError addSubError(RestError re){
        if (subErrors == null){
            subErrors = new ArrayList<>();
        }
        subErrors.add(re);
        return this;
    }
    public List<RestError> getSubErrors() {
        return subErrors;
    }

    public RestError setSubErrors(List<RestError> subErrors) {
        this.subErrors = subErrors;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public RestError setMessage(String message) {
        this.message = message;
        return this;
    }

    public Long getErrorCause() {
        return errorCause;
    }

    public RestError setErrorCause(Long errorCause) {
        this.errorCause = errorCause;
        return this;
    }
}
