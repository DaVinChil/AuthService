package com.hm.authservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@RestControllerAdvice
public class RestExceptionHandler {
    @ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<String> invalidCredentialHandler(InvalidCredentials ice){
        return new ResponseEntity<>(ice.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity<String> unauthorizedUserHandler(UnauthorizedUser uue){
        return new ResponseEntity<>(uue.getMessage(), HttpStatus.UNAUTHORIZED);
    }
}
