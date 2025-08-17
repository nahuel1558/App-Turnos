package com.turnos.domain.exceptions;

import lombok.Value;

@Value
public class ErrorResponse {
    Integer status;
    String error;
    String message;
    String path;
    String timestamp;
}
