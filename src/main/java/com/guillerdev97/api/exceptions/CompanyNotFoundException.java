package com.guillerdev97.api.exceptions;

public class CompanyNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1;

    public CompanyNotFoundException(String message) {
        super(message);
    }
}
