package com.allstate.speedyclaimsserver.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class InvalidNewClaimException extends RuntimeException {

    public InvalidNewClaimException(String message) {
        super(message);
    }

}
