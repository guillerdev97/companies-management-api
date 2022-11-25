package com.guillerdev97.api.exceptions;

import lombok.Data;

@Data
public class ErrorObject {
    private int statusCode;
    private String message;
}
